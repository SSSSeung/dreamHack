package com.teamsa.piggybank.cash.service.usd;

import com.teamsa.piggybank.cash.domain.Usdcash;
import com.teamsa.piggybank.cash.domain.UsdcashLog;
import com.teamsa.piggybank.cash.repository.usd.USDCashLogRepository;
import com.teamsa.piggybank.cash.repository.usd.USDCashRepository;
import com.teamsa.piggybank.cash.service.CashServiceException;
import com.teamsa.piggybank.user.domain.User;
import com.teamsa.piggybank.user.service.UserService;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0016J*\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0017J \u0010!\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001bH\u0017J \u0010\"\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001bH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006#"},
   d2 = {"Lcom/teamsa/piggybank/cash/service/usd/USDCashService;", "", "usdcashRepository", "Lcom/teamsa/piggybank/cash/repository/usd/USDCashRepository;", "usdcashLogRepository", "Lcom/teamsa/piggybank/cash/repository/usd/USDCashLogRepository;", "userService", "Lcom/teamsa/piggybank/user/service/UserService;", "(Lcom/teamsa/piggybank/cash/repository/usd/USDCashRepository;Lcom/teamsa/piggybank/cash/repository/usd/USDCashLogRepository;Lcom/teamsa/piggybank/user/service/UserService;)V", "checkIdExist", "", "id", "", "checkUserExistByAccNumber", "", "accNumber", "createBank", "findUsdcashById", "Lcom/teamsa/piggybank/cash/domain/Usdcash;", "findUsdcashLogByReceiverIdAndCategory", "", "Lcom/teamsa/piggybank/cash/domain/UsdcashLog;", "receiverId", "category", "findUsdcashLogBySenderIdAndCategory", "senderId", "getBalance", "Ljava/math/BigDecimal;", "getInfo", "saveLog", "sender", "receiver", "amount", "transferCash", "transferCommToBank", "piggybank"}
)
public class USDCashService {
   @NotNull
   private final USDCashRepository usdcashRepository;
   @NotNull
   private final USDCashLogRepository usdcashLogRepository;
   @NotNull
   private final UserService userService;

   public USDCashService(@NotNull USDCashRepository usdcashRepository, @NotNull USDCashLogRepository usdcashLogRepository, @NotNull UserService userService) {
      Intrinsics.checkNotNullParameter(usdcashRepository, "usdcashRepository");
      Intrinsics.checkNotNullParameter(usdcashLogRepository, "usdcashLogRepository");
      Intrinsics.checkNotNullParameter(userService, "userService");
      super();
      this.usdcashRepository = usdcashRepository;
      this.usdcashLogRepository = usdcashLogRepository;
      this.userService = userService;
   }

   @Transactional
   public void createBank(@NotNull String id) {
      Intrinsics.checkNotNullParameter(id, "id");
      User user = this.userService.findUserById(id);
      if (this.checkIdExist(user.getId())) {
         throw new CashServiceException("현재 이미 USD 통장이 개설되어 있습니다.");
      } else {
         USDCashRepository var10000 = this.usdcashRepository;
         String var3 = user.getUsername();
         BigDecimal var4 = BigDecimal.ZERO;
         String var5 = user.getId();
         String var6 = user.getRealName();
         Intrinsics.checkNotNull(var4);
         var10000.save(new Usdcash(0L, var3, var4, var6, (String)null, var5, 17, (DefaultConstructorMarker)null));
      }
   }

   @Transactional
   @NotNull
   public Usdcash transferCash(@NotNull String senderId, @NotNull Usdcash receiver, @NotNull BigDecimal amount) {
      Intrinsics.checkNotNullParameter(senderId, "senderId");
      Intrinsics.checkNotNullParameter(receiver, "receiver");
      Intrinsics.checkNotNullParameter(amount, "amount");
      this.checkUserExistByAccNumber(receiver.getAccNumber());
      Usdcash var10000 = this.usdcashRepository.findUsdcashById(senderId);
      if (var10000 == null) {
         throw new CashServiceException("보내는 사람의 정보가 존재하지 않습니다.");
      } else {
         Usdcash sender = var10000;
         if (!Intrinsics.areEqual(sender.getAccNumber(), receiver.getAccNumber()) && !Intrinsics.areEqual(sender.getId(), receiver.getId())) {
            if (amount.compareTo(BigDecimal.ZERO) <= 0) {
               throw new CashServiceException("보내는 액수가 0보다 커야 합니다!");
            } else if (sender.getBalance().compareTo(amount) < 0) {
               throw new CashServiceException("보내는 액수보다 가지고 있는 금액이 부족합니다!");
            } else {
               BigDecimal var10001 = receiver.getBalance().add(amount);
               Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
               receiver.setBalance(var10001);
               var10001 = sender.getBalance().subtract(amount);
               Intrinsics.checkNotNullExpressionValue(var10001, "subtract(...)");
               sender.setBalance(var10001);
               saveLog$default(this, sender, receiver, amount, (String)null, 8, (Object)null);
               return receiver;
            }
         } else {
            throw new CashServiceException("자기자신에게 송금할 수 없습니다!");
         }
      }
   }

   @Transactional
   @NotNull
   public Usdcash transferCommToBank(@NotNull String senderId, @NotNull String receiverId, @NotNull BigDecimal amount) {
      Intrinsics.checkNotNullParameter(senderId, "senderId");
      Intrinsics.checkNotNullParameter(receiverId, "receiverId");
      Intrinsics.checkNotNullParameter(amount, "amount");
      Usdcash var10000 = this.usdcashRepository.findUsdcashById(senderId);
      if (var10000 == null) {
         throw new CashServiceException("보내는 사람의 정보가 존재하지 않습니다.");
      } else {
         Usdcash sender = var10000;
         var10000 = this.usdcashRepository.findUsdcashById(receiverId);
         if (var10000 == null) {
            throw new CashServiceException("받는 사람의 정보가 존재하지 않습니다.");
         } else {
            Usdcash receiver = var10000;
            this.checkUserExistByAccNumber(receiver.getAccNumber());
            if (amount.compareTo(BigDecimal.ZERO) < 0) {
               throw new CashServiceException("보내는 액수가 0보다 커야 합니다!");
            } else {
               BigDecimal var10001 = receiver.getBalance().add(amount);
               Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
               receiver.setBalance(var10001);
               this.saveLog(sender, receiver, amount, "commission");
               return receiver;
            }
         }
      }
   }

   @Transactional
   public void saveLog(@NotNull Usdcash sender, @NotNull Usdcash receiver, @NotNull BigDecimal amount, @NotNull String category) {
      Intrinsics.checkNotNullParameter(sender, "sender");
      Intrinsics.checkNotNullParameter(receiver, "receiver");
      Intrinsics.checkNotNullParameter(amount, "amount");
      Intrinsics.checkNotNullParameter(category, "category");
      this.usdcashLogRepository.save(new UsdcashLog(sender.getAccNumber(), receiver.getAccNumber(), amount, category, sender.getId(), receiver.getId(), (LocalDateTime)null, 0L, 192, (DefaultConstructorMarker)null));
   }

   // $FF: synthetic method
   public static void saveLog$default(USDCashService var0, Usdcash var1, Usdcash var2, BigDecimal var3, String var4, int var5, Object var6) {
      if (var6 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveLog");
      } else {
         if ((var5 & 8) != 0) {
            var4 = "transfer";
         }

         var0.saveLog(var1, var2, var3, var4);
      }
   }

   @NotNull
   public BigDecimal getBalance(@NotNull String id) {
      Intrinsics.checkNotNullParameter(id, "id");
      Usdcash var10000 = this.usdcashRepository.findUsdcashById(id);
      if (var10000 != null) {
         BigDecimal var2 = var10000.getBalance();
         if (var2 != null) {
            return var2;
         }
      }

      throw new CashServiceException("잔액을 가져올 수 없습니다.");
   }

   @NotNull
   public Usdcash getInfo(@NotNull String accNumber) {
      Intrinsics.checkNotNullParameter(accNumber, "accNumber");
      this.checkUserExistByAccNumber(accNumber);
      return this.usdcashRepository.findUsdcashByAccNumber(accNumber);
   }

   public void checkUserExistByAccNumber(@NotNull String accNumber) {
      Intrinsics.checkNotNullParameter(accNumber, "accNumber");
      if (!this.usdcashRepository.existsByAccNumber(accNumber)) {
         throw new CashServiceException("존재하지 않는 계좌번호입니다.");
      }
   }

   public boolean checkIdExist(@NotNull String id) {
      Intrinsics.checkNotNullParameter(id, "id");
      return this.usdcashRepository.existsById(id);
   }

   @Nullable
   public Usdcash findUsdcashById(@NotNull String id) {
      Intrinsics.checkNotNullParameter(id, "id");
      return this.usdcashRepository.findUsdcashById(id);
   }

   @NotNull
   public List<UsdcashLog> findUsdcashLogBySenderIdAndCategory(@NotNull String senderId, @NotNull String category) {
      Intrinsics.checkNotNullParameter(senderId, "senderId");
      Intrinsics.checkNotNullParameter(category, "category");
      return this.usdcashLogRepository.findUsdcashLogBySenderIdAndCategory(senderId, category);
   }

   @NotNull
   public List<UsdcashLog> findUsdcashLogByReceiverIdAndCategory(@NotNull String receiverId, @NotNull String category) {
      Intrinsics.checkNotNullParameter(receiverId, "receiverId");
      Intrinsics.checkNotNullParameter(category, "category");
      return this.usdcashLogRepository.findUsdcashLogByReceiverIdAndCategory(receiverId, category);
   }
}
