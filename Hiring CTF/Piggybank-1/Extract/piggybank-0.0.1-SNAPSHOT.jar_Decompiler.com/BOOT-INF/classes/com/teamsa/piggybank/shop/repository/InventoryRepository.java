package com.teamsa.piggybank.shop.repository;

import com.teamsa.piggybank.shop.domain.Inventory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"},
   d2 = {"Lcom/teamsa/piggybank/shop/repository/InventoryRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/teamsa/piggybank/shop/domain/Inventory;", "", "existsByProductIdAndUserUuid", "", "id", "", "userUuid", "piggybank"}
)
public interface InventoryRepository extends JpaRepository<Inventory, String> {
   boolean existsByProductIdAndUserUuid(long id, @NotNull String userUuid);
}
