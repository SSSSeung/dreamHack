package com.teamsa.piggybank.cash.repository.usd;

import com.teamsa.piggybank.cash.domain.UsdcashLog;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\n"},
   d2 = {"Lcom/teamsa/piggybank/cash/repository/usd/USDCashLogRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/teamsa/piggybank/cash/domain/UsdcashLog;", "", "findUsdcashLogByReceiverIdAndCategory", "", "receiverId", "category", "findUsdcashLogBySenderIdAndCategory", "senderId", "piggybank"}
)
public interface USDCashLogRepository extends JpaRepository<UsdcashLog, String> {
   @NotNull
   List<UsdcashLog> findUsdcashLogBySenderIdAndCategory(@NotNull String senderId, @NotNull String category);

   @NotNull
   List<UsdcashLog> findUsdcashLogByReceiverIdAndCategory(@NotNull String receiverId, @NotNull String category);
}
