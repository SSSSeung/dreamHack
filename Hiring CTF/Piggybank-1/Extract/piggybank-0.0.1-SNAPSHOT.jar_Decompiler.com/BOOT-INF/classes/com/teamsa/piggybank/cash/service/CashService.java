package com.teamsa.piggybank.cash.service;

import com.teamsa.piggybank.cash.CashConstants;
import com.teamsa.piggybank.cash.domain.CashExchangeLog;
import com.teamsa.piggybank.cash.domain.Krwcash;
import com.teamsa.piggybank.cash.domain.Usdcash;
import com.teamsa.piggybank.cash.repository.CashExchangeLogRepository;
import com.teamsa.piggybank.cash.repository.krw.KRWCashRepository;
import com.teamsa.piggybank.cash.repository.usd.USDCashRepository;
import com.teamsa.piggybank.cash.service.krw.KRWCashService;
import com.teamsa.piggybank.cash.service.usd.USDCashService;
import com.teamsa.piggybank.user.domain.User;
import com.teamsa.piggybank.user.service.UserService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.List;
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
   d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J8\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J \u0010!\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\""},
   d2 = {"Lcom/teamsa/piggybank/cash/service/CashService;", "", "krwCashService", "Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;", "usdCashService", "Lcom/teamsa/piggybank/cash/service/usd/USDCashService;", "krwCashRepository", "Lcom/teamsa/piggybank/cash/repository/krw/KRWCashRepository;", "usdCashRepository", "Lcom/teamsa/piggybank/cash/repository/usd/USDCashRepository;", "cashExchangeLogRepository", "Lcom/teamsa/piggybank/cash/repository/CashExchangeLogRepository;", "userService", "Lcom/teamsa/piggybank/user/service/UserService;", "(Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;Lcom/teamsa/piggybank/cash/service/usd/USDCashService;Lcom/teamsa/piggybank/cash/repository/krw/KRWCashRepository;Lcom/teamsa/piggybank/cash/repository/usd/USDCashRepository;Lcom/teamsa/piggybank/cash/repository/CashExchangeLogRepository;Lcom/teamsa/piggybank/user/service/UserService;)V", "exchangeCash", "", "id", "", "src", "dst", "amount", "Ljava/math/BigDecimal;", "findCashExchangeLogBySubjectId", "", "Lcom/teamsa/piggybank/cash/domain/CashExchangeLog;", "subjectId", "getAdminUuid", "username", "saveCashExchangeLog", "", "srcPrice", "dstPrice", "verifyAvailableCurrency", "piggybank"}
)
public class CashService {
   @NotNull
   private final KRWCashService krwCashService;
   @NotNull
   private final USDCashService usdCashService;
   @NotNull
   private final KRWCashRepository krwCashRepository;
   @NotNull
   private final USDCashRepository usdCashRepository;
   @NotNull
   private final CashExchangeLogRepository cashExchangeLogRepository;
   @NotNull
   private final UserService userService;

   public CashService(@NotNull KRWCashService krwCashService, @NotNull USDCashService usdCashService, @NotNull KRWCashRepository krwCashRepository, @NotNull USDCashRepository usdCashRepository, @NotNull CashExchangeLogRepository cashExchangeLogRepository, @NotNull UserService userService) {
      Intrinsics.checkNotNullParameter(krwCashService, "krwCashService");
      Intrinsics.checkNotNullParameter(usdCashService, "usdCashService");
      Intrinsics.checkNotNullParameter(krwCashRepository, "krwCashRepository");
      Intrinsics.checkNotNullParameter(usdCashRepository, "usdCashRepository");
      Intrinsics.checkNotNullParameter(cashExchangeLogRepository, "cashExchangeLogRepository");
      Intrinsics.checkNotNullParameter(userService, "userService");
      super();
      this.krwCashService = krwCashService;
      this.usdCashService = usdCashService;
      this.krwCashRepository = krwCashRepository;
      this.usdCashRepository = usdCashRepository;
      this.cashExchangeLogRepository = cashExchangeLogRepository;
      this.userService = userService;
   }

   @Transactional
   public boolean exchangeCash(@NotNull String id, @NotNull String src, @NotNull String dst, @NotNull BigDecimal amount) {
      Intrinsics.checkNotNullParameter(id, "id");
      Intrinsics.checkNotNullParameter(src, "src");
      Intrinsics.checkNotNullParameter(dst, "dst");
      Intrinsics.checkNotNullParameter(amount, "amount");
      this.verifyAvailableCurrency(id, src, dst);
      if (Intrinsics.areEqual(src, dst)) {
         new CashServiceException("같은 통화로 환전할 수 없습니다!");
      }

      String adminUuid = this.getAdminUuid("admin");
      BigDecimal comm;
      BigDecimal curPriceWithComm;
      BigDecimal var14;
      Usdcash var15;
      Krwcash var10000;
      BigDecimal var10001;
      if (!Intrinsics.areEqual(src, "KRW") && !Intrinsics.areEqual(dst, "USD")) {
         if (!Intrinsics.areEqual(src, "USD") && !Intrinsics.areEqual(dst, "KRW")) {
            return false;
         } else {
            var15 = this.usdCashService.findUsdcashById(id);
            if (var15 == null) {
               throw new CashServiceException("USD 계좌가 존재하지 않습니다!");
            } else {
               Usdcash usdcash = var15;
               if (amount.compareTo(BigDecimal.ZERO) <= 0) {
                  throw new CashServiceException("보내는 액수가 0보다 커야 합니다!");
               } else {
                  var14 = amount.multiply(new BigDecimal(0.008D));
                  Intrinsics.checkNotNullExpressionValue(var14, "multiply(...)");
                  comm = var14;
                  var14 = amount.add(comm);
                  Intrinsics.checkNotNullExpressionValue(var14, "add(...)");
                  curPriceWithComm = var14;
                  if (usdcash.getBalance().compareTo(curPriceWithComm) < 0) {
                     throw new CashServiceException("돈이 부족해서 환전이 불가능합니다.");
                  } else {
                     this.usdCashService.transferCommToBank(id, adminUuid, comm);
                     var10000 = this.krwCashService.findKrwcashById(id);
                     if (var10000 == null) {
                        throw new CashServiceException("KRW 계좌가 존재하지 않습니다!");
                     } else {
                        Krwcash krwcash = var10000;
                        var10001 = usdcash.getBalance().subtract(curPriceWithComm);
                        Intrinsics.checkNotNullExpressionValue(var10001, "subtract(...)");
                        usdcash.setBalance(var10001);
                        var10001 = krwcash.getBalance();
                        BigDecimal var10002 = amount.multiply(new BigDecimal(1320));
                        Intrinsics.checkNotNullExpressionValue(var10002, "multiply(...)");
                        var10001 = var10001.add(var10002);
                        Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
                        krwcash.setBalance(var10001);
                        this.saveCashExchangeLog(src, dst, new BigDecimal(1), new BigDecimal(1320), amount, id);
                        return true;
                     }
                  }
               }
            }
         }
      } else {
         var10000 = this.krwCashService.findKrwcashById(id);
         if (var10000 == null) {
            throw new CashServiceException("KRW 계좌가 존재하지 않습니다!");
         } else {
            Krwcash krwcash = var10000;
            if (amount.compareTo(BigDecimal.ZERO) <= 0) {
               throw new CashServiceException("보내는 액수가 0보다 커야 합니다!");
            } else {
               var14 = amount.multiply(new BigDecimal(0.008D));
               Intrinsics.checkNotNullExpressionValue(var14, "multiply(...)");
               comm = var14;
               var14 = amount.add(comm);
               Intrinsics.checkNotNullExpressionValue(var14, "add(...)");
               curPriceWithComm = var14;
               if (krwcash.getBalance().compareTo(curPriceWithComm) < 0) {
                  throw new CashServiceException("돈이 부족해서 환전이 불가능합니다.");
               } else {
                  this.krwCashService.transferCommToBank(id, adminUuid, comm);
                  var15 = this.usdCashService.findUsdcashById(id);
                  if (var15 == null) {
                     throw new CashServiceException("USD 계좌가 존재하지 않습니다!");
                  } else {
                     Usdcash usdcash = var15;
                     var10001 = krwcash.getBalance().subtract(curPriceWithComm);
                     Intrinsics.checkNotNullExpressionValue(var10001, "subtract(...)");
                     krwcash.setBalance(var10001);
                     BigDecimal var11 = usdcash.getBalance();
                     var10001 = amount.divide(new BigDecimal(1320), 4, RoundingMode.FLOOR);
                     Intrinsics.checkNotNullExpressionValue(var10001, "divide(...)");
                     var10001 = var11.add(var10001);
                     Intrinsics.checkNotNullExpressionValue(var10001, "add(...)");
                     usdcash.setBalance(var10001);
                     this.saveCashExchangeLog(src, dst, new BigDecimal(1320), new BigDecimal(1), amount, id);
                     return true;
                  }
               }
            }
         }
      }
   }

   public void verifyAvailableCurrency(@NotNull String id, @NotNull String src, @NotNull String dst) {
      Intrinsics.checkNotNullParameter(id, "id");
      Intrinsics.checkNotNullParameter(src, "src");
      Intrinsics.checkNotNullParameter(dst, "dst");
      if (CashConstants.INSTANCE.getAVAILABLE_CURRENCIES().contains(src) && CashConstants.INSTANCE.getAVAILABLE_CURRENCIES().contains(dst)) {
         if ((Intrinsics.areEqual(src, "KRW") || Intrinsics.areEqual(dst, "KRW")) && !this.krwCashRepository.existsById(id)) {
            throw new CashServiceException("KRW 계좌가 존재하지 않습니다!");
         } else if ((Intrinsics.areEqual(src, "USD") || Intrinsics.areEqual(dst, "USD")) && !this.usdCashRepository.existsById(id)) {
            throw new CashServiceException("USD 계좌가 존재하지 않습니다!");
         }
      } else {
         throw new CashServiceException("현재 은행에서 지원하지 않는 통화입니다.");
      }
   }

   @NotNull
   public String getAdminUuid(@NotNull String username) {
      Intrinsics.checkNotNullParameter(username, "username");
      User user = this.userService.findUserByUsernameOrThrow(username);
      return user.getId();
   }

   public void saveCashExchangeLog(@NotNull String src, @NotNull String dst, @NotNull BigDecimal srcPrice, @NotNull BigDecimal dstPrice, @NotNull BigDecimal amount, @NotNull String subjectId) {
      Intrinsics.checkNotNullParameter(src, "src");
      Intrinsics.checkNotNullParameter(dst, "dst");
      Intrinsics.checkNotNullParameter(srcPrice, "srcPrice");
      Intrinsics.checkNotNullParameter(dstPrice, "dstPrice");
      Intrinsics.checkNotNullParameter(amount, "amount");
      Intrinsics.checkNotNullParameter(subjectId, "subjectId");
      this.cashExchangeLogRepository.save(new CashExchangeLog(src, dst, new BigDecimal(1), new BigDecimal(1320), amount, subjectId, (LocalDateTime)null, 0L, 192, (DefaultConstructorMarker)null));
   }

   @NotNull
   public List<CashExchangeLog> findCashExchangeLogBySubjectId(@NotNull String subjectId) {
      Intrinsics.checkNotNullParameter(subjectId, "subjectId");
      return this.cashExchangeLogRepository.findCashExchangeLogBySubjectId(subjectId);
   }
}
