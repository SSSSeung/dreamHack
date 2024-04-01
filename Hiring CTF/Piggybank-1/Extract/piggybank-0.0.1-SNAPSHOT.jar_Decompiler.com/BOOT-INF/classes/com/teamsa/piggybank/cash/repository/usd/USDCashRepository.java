package com.teamsa.piggybank.cash.repository.usd;

import com.teamsa.piggybank.cash.domain.Usdcash;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\u000b"},
   d2 = {"Lcom/teamsa/piggybank/cash/repository/usd/USDCashRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/teamsa/piggybank/cash/domain/Usdcash;", "", "existsByAccNumber", "", "accNumber", "existsById", "id", "findUsdcashByAccNumber", "findUsdcashById", "piggybank"}
)
public interface USDCashRepository extends JpaRepository<Usdcash, String> {
   boolean existsByAccNumber(@NotNull String accNumber);

   boolean existsById(@NotNull String id);

   @Nullable
   Usdcash findUsdcashById(@NotNull String id);

   @NotNull
   Usdcash findUsdcashByAccNumber(@NotNull String accNumber);
}
