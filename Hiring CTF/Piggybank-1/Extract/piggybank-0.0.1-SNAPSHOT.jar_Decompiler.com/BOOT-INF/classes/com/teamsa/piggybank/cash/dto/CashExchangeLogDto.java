package com.teamsa.piggybank.cash.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"},
   d2 = {"Lcom/teamsa/piggybank/cash/dto/CashExchangeLogDto;", "", "srcCurrency", "", "dstCurrency", "srcPrice", "Ljava/math/BigDecimal;", "dstPrice", "amount", "subjectId", "exchangeDate", "Ljava/time/LocalDateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/time/LocalDateTime;)V", "getAmount", "()Ljava/math/BigDecimal;", "getDstCurrency", "()Ljava/lang/String;", "getDstPrice", "getExchangeDate", "()Ljava/time/LocalDateTime;", "getSrcCurrency", "getSrcPrice", "getSubjectId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "piggybank"}
)
public final class CashExchangeLogDto {
   @NotNull
   private final String srcCurrency;
   @NotNull
   private final String dstCurrency;
   @NotNull
   private final BigDecimal srcPrice;
   @NotNull
   private final BigDecimal dstPrice;
   @NotNull
   private final BigDecimal amount;
   @NotNull
   private final String subjectId;
   @NotNull
   private final LocalDateTime exchangeDate;

   public CashExchangeLogDto(@NotNull String srcCurrency, @NotNull String dstCurrency, @NotNull BigDecimal srcPrice, @NotNull BigDecimal dstPrice, @NotNull BigDecimal amount, @NotNull String subjectId, @NotNull LocalDateTime exchangeDate) {
      Intrinsics.checkNotNullParameter(srcCurrency, "srcCurrency");
      Intrinsics.checkNotNullParameter(dstCurrency, "dstCurrency");
      Intrinsics.checkNotNullParameter(srcPrice, "srcPrice");
      Intrinsics.checkNotNullParameter(dstPrice, "dstPrice");
      Intrinsics.checkNotNullParameter(amount, "amount");
      Intrinsics.checkNotNullParameter(subjectId, "subjectId");
      Intrinsics.checkNotNullParameter(exchangeDate, "exchangeDate");
      super();
      this.srcCurrency = srcCurrency;
      this.dstCurrency = dstCurrency;
      this.srcPrice = srcPrice;
      this.dstPrice = dstPrice;
      this.amount = amount;
      this.subjectId = subjectId;
      this.exchangeDate = exchangeDate;
   }

   @NotNull
   public final String getSrcCurrency() {
      return this.srcCurrency;
   }

   @NotNull
   public final String getDstCurrency() {
      return this.dstCurrency;
   }

   @NotNull
   public final BigDecimal getSrcPrice() {
      return this.srcPrice;
   }

   @NotNull
   public final BigDecimal getDstPrice() {
      return this.dstPrice;
   }

   @NotNull
   public final BigDecimal getAmount() {
      return this.amount;
   }

   @NotNull
   public final String getSubjectId() {
      return this.subjectId;
   }

   @NotNull
   public final LocalDateTime getExchangeDate() {
      return this.exchangeDate;
   }

   @NotNull
   public final String component1() {
      return this.srcCurrency;
   }

   @NotNull
   public final String component2() {
      return this.dstCurrency;
   }

   @NotNull
   public final BigDecimal component3() {
      return this.srcPrice;
   }

   @NotNull
   public final BigDecimal component4() {
      return this.dstPrice;
   }

   @NotNull
   public final BigDecimal component5() {
      return this.amount;
   }

   @NotNull
   public final String component6() {
      return this.subjectId;
   }

   @NotNull
   public final LocalDateTime component7() {
      return this.exchangeDate;
   }

   @NotNull
   public final CashExchangeLogDto copy(@NotNull String srcCurrency, @NotNull String dstCurrency, @NotNull BigDecimal srcPrice, @NotNull BigDecimal dstPrice, @NotNull BigDecimal amount, @NotNull String subjectId, @NotNull LocalDateTime exchangeDate) {
      Intrinsics.checkNotNullParameter(srcCurrency, "srcCurrency");
      Intrinsics.checkNotNullParameter(dstCurrency, "dstCurrency");
      Intrinsics.checkNotNullParameter(srcPrice, "srcPrice");
      Intrinsics.checkNotNullParameter(dstPrice, "dstPrice");
      Intrinsics.checkNotNullParameter(amount, "amount");
      Intrinsics.checkNotNullParameter(subjectId, "subjectId");
      Intrinsics.checkNotNullParameter(exchangeDate, "exchangeDate");
      return new CashExchangeLogDto(srcCurrency, dstCurrency, srcPrice, dstPrice, amount, subjectId, exchangeDate);
   }

   // $FF: synthetic method
   public static CashExchangeLogDto copy$default(CashExchangeLogDto var0, String var1, String var2, BigDecimal var3, BigDecimal var4, BigDecimal var5, String var6, LocalDateTime var7, int var8, Object var9) {
      if ((var8 & 1) != 0) {
         var1 = var0.srcCurrency;
      }

      if ((var8 & 2) != 0) {
         var2 = var0.dstCurrency;
      }

      if ((var8 & 4) != 0) {
         var3 = var0.srcPrice;
      }

      if ((var8 & 8) != 0) {
         var4 = var0.dstPrice;
      }

      if ((var8 & 16) != 0) {
         var5 = var0.amount;
      }

      if ((var8 & 32) != 0) {
         var6 = var0.subjectId;
      }

      if ((var8 & 64) != 0) {
         var7 = var0.exchangeDate;
      }

      return var0.copy(var1, var2, var3, var4, var5, var6, var7);
   }

   @NotNull
   public String toString() {
      return "CashExchangeLogDto(srcCurrency=" + this.srcCurrency + ", dstCurrency=" + this.dstCurrency + ", srcPrice=" + this.srcPrice + ", dstPrice=" + this.dstPrice + ", amount=" + this.amount + ", subjectId=" + this.subjectId + ", exchangeDate=" + this.exchangeDate + ")";
   }

   public int hashCode() {
      int result = this.srcCurrency.hashCode();
      result = result * 31 + this.dstCurrency.hashCode();
      result = result * 31 + this.srcPrice.hashCode();
      result = result * 31 + this.dstPrice.hashCode();
      result = result * 31 + this.amount.hashCode();
      result = result * 31 + this.subjectId.hashCode();
      result = result * 31 + this.exchangeDate.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof CashExchangeLogDto)) {
         return false;
      } else {
         CashExchangeLogDto var2 = (CashExchangeLogDto)other;
         if (!Intrinsics.areEqual(this.srcCurrency, var2.srcCurrency)) {
            return false;
         } else if (!Intrinsics.areEqual(this.dstCurrency, var2.dstCurrency)) {
            return false;
         } else if (!Intrinsics.areEqual(this.srcPrice, var2.srcPrice)) {
            return false;
         } else if (!Intrinsics.areEqual(this.dstPrice, var2.dstPrice)) {
            return false;
         } else if (!Intrinsics.areEqual(this.amount, var2.amount)) {
            return false;
         } else if (!Intrinsics.areEqual(this.subjectId, var2.subjectId)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.exchangeDate, var2.exchangeDate);
         }
      }
   }
}
