package com.teamsa.piggybank.shop.repository;

import com.teamsa.piggybank.shop.domain.Shop;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"},
   d2 = {"Lcom/teamsa/piggybank/shop/repository/ShopRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/teamsa/piggybank/shop/domain/Shop;", "", "existsById", "", "id", "", "findShopById", "productId", "piggybank"}
)
public interface ShopRepository extends JpaRepository<Shop, String> {
   boolean existsById(long id);

   @Nullable
   Shop findShopById(long productId);
}
