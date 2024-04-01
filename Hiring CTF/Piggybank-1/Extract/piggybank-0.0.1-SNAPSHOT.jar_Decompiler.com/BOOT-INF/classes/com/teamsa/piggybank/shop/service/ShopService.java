package com.teamsa.piggybank.shop.service;

import com.teamsa.piggybank.cash.domain.Krwcash;
import com.teamsa.piggybank.cash.repository.krw.KRWCashRepository;
import com.teamsa.piggybank.shop.domain.Inventory;
import com.teamsa.piggybank.shop.domain.Shop;
import com.teamsa.piggybank.shop.repository.InventoryRepository;
import com.teamsa.piggybank.shop.repository.ShopRepository;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"},
   d2 = {"Lcom/teamsa/piggybank/shop/service/ShopService;", "", "shopRepository", "Lcom/teamsa/piggybank/shop/repository/ShopRepository;", "krwCashRepository", "Lcom/teamsa/piggybank/cash/repository/krw/KRWCashRepository;", "inventoryRepository", "Lcom/teamsa/piggybank/shop/repository/InventoryRepository;", "(Lcom/teamsa/piggybank/shop/repository/ShopRepository;Lcom/teamsa/piggybank/cash/repository/krw/KRWCashRepository;Lcom/teamsa/piggybank/shop/repository/InventoryRepository;)V", "purchaseItem", "", "productId", "", "userId", "", "piggybank"}
)
public class ShopService {
   @NotNull
   private final ShopRepository shopRepository;
   @NotNull
   private final KRWCashRepository krwCashRepository;
   @NotNull
   private final InventoryRepository inventoryRepository;

   public ShopService(@NotNull ShopRepository shopRepository, @NotNull KRWCashRepository krwCashRepository, @NotNull InventoryRepository inventoryRepository) {
      Intrinsics.checkNotNullParameter(shopRepository, "shopRepository");
      Intrinsics.checkNotNullParameter(krwCashRepository, "krwCashRepository");
      Intrinsics.checkNotNullParameter(inventoryRepository, "inventoryRepository");
      super();
      this.shopRepository = shopRepository;
      this.krwCashRepository = krwCashRepository;
      this.inventoryRepository = inventoryRepository;
   }

   @Transactional
   public void purchaseItem(long productId, @NotNull String userId) {
      Intrinsics.checkNotNullParameter(userId, "userId");
      if (!this.shopRepository.existsById(productId)) {
         throw new ShopServiceException("존재하지 않는 상품입니다!");
      } else {
         Krwcash var10000 = this.krwCashRepository.findKrwcashById(userId);
         if (var10000 == null) {
            throw new ShopServiceException("계좌 정보를 찾을 수 없습니다.");
         } else {
            Krwcash userKrwcash = var10000;
            Shop var6 = this.shopRepository.findShopById(productId);
            if (var6 == null) {
               throw new ShopServiceException("상품 정보를 가져올 수 없습니다.");
            } else {
               Shop product = var6;
               if (this.inventoryRepository.existsByProductIdAndUserUuid(productId, userId)) {
                  throw new ShopServiceException("이 상품은 이미 가지고 있는 상품입니다.");
               } else if (Intrinsics.areEqual(product.getOwner(), userKrwcash.getUsername())) {
                  throw new ShopServiceException("상품의 소유자는 구매할 수 없습니다.");
               } else if (product.getPrice().compareTo(userKrwcash.getBalance()) > 0) {
                  throw new ShopServiceException("상품을 구매하기에 잔액이 부족합니다.");
               } else {
                  BigDecimal var10001 = userKrwcash.getBalance().subtract(product.getPrice());
                  Intrinsics.checkNotNullExpressionValue(var10001, "subtract(...)");
                  userKrwcash.setBalance(var10001);
                  this.inventoryRepository.save(new Inventory(product.getId(), product.getProductName(), userId, 0L, 8, (DefaultConstructorMarker)null));
               }
            }
         }
      }
   }
}
