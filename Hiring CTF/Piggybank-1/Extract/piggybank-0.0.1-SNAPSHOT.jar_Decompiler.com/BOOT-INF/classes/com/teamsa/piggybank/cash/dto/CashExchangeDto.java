package com.teamsa.piggybank.cash.dto;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"},
   d2 = {"Lcom/teamsa/piggybank/cash/dto/CashExchangeDto;", "", "srcCurrency", "", "dstCurrency", "amount", "Ljava/math/BigDecimal;", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "getDstCurrency", "()Ljava/lang/String;", "getSrcCurrency", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "piggybank"}
)
public final class CashExchangeDto {
   @NotNull
   private final String srcCurrency;
   @NotNull
   private final String dstCurrency;
   @NotNull
   private final BigDecimal amount;

   public CashExchangeDto(@NotNull String srcCurrency, @NotNull String dstCurrency, @NotNull BigDecimal amount) {
      Intrinsics.checkNotNullParameter(srcCurrency, "srcCurrency");
      Intrinsics.checkNotNullParameter(dstCurrency, "dstCurrency");
      Intrinsics.checkNotNullParameter(amount, "amount");
      super();
      this.srcCurrency = srcCurrency;
      this.dstCurrency = dstCurrency;
      this.amount = amount;
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
   public final BigDecimal getAmount() {
      return this.amount;
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
      return this.amount;
   }

   @NotNull
   public final CashExchangeDto copy(@NotNull String srcCurrency, @NotNull String dstCurrency, @NotNull BigDecimal amount) {
      Intrinsics.checkNotNullParameter(srcCurrency, "srcCurrency");
      Intrinsics.checkNotNullParameter(dstCurrency, "dstCurrency");
      Intrinsics.checkNotNullParameter(amount, "amount");
      return new CashExchangeDto(srcCurrency, dstCurrency, amount);
   }

   // $FF: synthetic method
   public static CashExchangeDto copy$default(CashExchangeDto var0, String var1, String var2, BigDecimal var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.srcCurrency;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.dstCurrency;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.amount;
      }

      return var0.copy(var1, var2, var3);
   }

   @NotNull
   public String toString() {
      return "CashExchangeDto(srcCurrency=" + this.srcCurrency + ", dstCurrency=" + this.dstCurrency + ", amount=" + this.amount + ")";
   }

   public int hashCode() {
      int result = this.srcCurrency.hashCode();
      result = result * 31 + this.dstCurrency.hashCode();
      result = result * 31 + this.amount.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof CashExchangeDto)) {
         return false;
      } else {
         CashExchangeDto var2 = (CashExchangeDto)other;
         if (!Intrinsics.areEqual(this.srcCurrency, var2.srcCurrency)) {
            return false;
         } else if (!Intrinsics.areEqual(this.dstCurrency, var2.dstCurrency)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.amount, var2.amount);
         }
      }
   }
}
