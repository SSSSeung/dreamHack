package com.teamsa.piggybank.shop.controller;

import com.teamsa.piggybank.shop.domain.Shop;
import com.teamsa.piggybank.shop.repository.InventoryRepository;
import com.teamsa.piggybank.shop.repository.ShopRepository;
import com.teamsa.piggybank.shop.service.ShopService;
import com.teamsa.piggybank.shop.service.ShopServiceException;
import jakarta.servlet.http.HttpSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/shop"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J*\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"},
   d2 = {"Lcom/teamsa/piggybank/shop/controller/ShopController;", "", "shopService", "Lcom/teamsa/piggybank/shop/service/ShopService;", "shopRepository", "Lcom/teamsa/piggybank/shop/repository/ShopRepository;", "inventoryRepository", "Lcom/teamsa/piggybank/shop/repository/InventoryRepository;", "(Lcom/teamsa/piggybank/shop/service/ShopService;Lcom/teamsa/piggybank/shop/repository/ShopRepository;Lcom/teamsa/piggybank/shop/repository/InventoryRepository;)V", "getPurchase", "", "authUser", "Ljakarta/servlet/http/HttpSession;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "productId", "", "model", "Lorg/springframework/ui/Model;", "postPurchase", "piggybank"}
)
public class ShopController {
   @NotNull
   private final ShopService shopService;
   @NotNull
   private final ShopRepository shopRepository;
   @NotNull
   private final InventoryRepository inventoryRepository;

   public ShopController(@NotNull ShopService shopService, @NotNull ShopRepository shopRepository, @NotNull InventoryRepository inventoryRepository) {
      Intrinsics.checkNotNullParameter(shopService, "shopService");
      Intrinsics.checkNotNullParameter(shopRepository, "shopRepository");
      Intrinsics.checkNotNullParameter(inventoryRepository, "inventoryRepository");
      super();
      this.shopService = shopService;
      this.shopRepository = shopRepository;
      this.inventoryRepository = inventoryRepository;
   }

   @GetMapping({"/purchase/{productId}"})
   @NotNull
   public String getPurchase(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @PathVariable("productId") long productId, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      String id = authUser.getAttribute("id").toString();
      Shop product = this.shopRepository.findShopById(productId);
      if (this.shopRepository.existsById(productId) && product != null) {
         model.addAttribute("productId", product.getId());
         model.addAttribute("productName", product.getProductName());
         model.addAttribute("productPrice", product.getPrice());
         if (this.inventoryRepository.existsByProductIdAndUserUuid(product.getId(), id)) {
            model.addAttribute("productDesc", product.getProductName());
            model.addAttribute("productDesc", product.getDescription());
         } else {
            model.addAttribute("productDesc", "상품 구매 후 안내 예정");
         }

         return "shop/purchase";
      } else {
         redirectAttrs.addFlashAttribute("error", "존재하지 않는 상품입니다!");
         return "redirect:/";
      }
   }

   @PostMapping({"/purchase/{productId}"})
   @NotNull
   public String postPurchase(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @PathVariable("productId") long productId, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      String id = authUser.getAttribute("id").toString();

      try {
         this.shopService.purchaseItem(productId, id);
         redirectAttrs.addFlashAttribute("alert", "구매 성공!");
         return "redirect:/shop/purchase/" + productId;
      } catch (ShopServiceException var8) {
         redirectAttrs.addFlashAttribute("error", var8.getMessage());
         return "redirect:/shop/purchase/" + productId;
      }
   }
}
