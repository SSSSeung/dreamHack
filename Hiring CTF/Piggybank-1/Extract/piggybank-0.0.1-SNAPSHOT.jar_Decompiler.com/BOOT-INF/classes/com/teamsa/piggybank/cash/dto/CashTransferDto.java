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
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"},
   d2 = {"Lcom/teamsa/piggybank/cash/dto/CashTransferDto;", "", "accNumber", "", "amount", "Ljava/math/BigDecimal;", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAccNumber", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "piggybank"}
)
public final class CashTransferDto {
   @NotNull
   private final String accNumber;
   @NotNull
   private final BigDecimal amount;

   public CashTransferDto(@NotNull String accNumber, @NotNull BigDecimal amount) {
      Intrinsics.checkNotNullParameter(accNumber, "accNumber");
      Intrinsics.checkNotNullParameter(amount, "amount");
      super();
      this.accNumber = accNumber;
      this.amount = amount;
   }

   @NotNull
   public final String getAccNumber() {
      return this.accNumber;
   }

   @NotNull
   public final BigDecimal getAmount() {
      return this.amount;
   }

   @NotNull
   public final String component1() {
      return this.accNumber;
   }

   @NotNull
   public final BigDecimal component2() {
      return this.amount;
   }

   @NotNull
   public final CashTransferDto copy(@NotNull String accNumber, @NotNull BigDecimal amount) {
      Intrinsics.checkNotNullParameter(accNumber, "accNumber");
      Intrinsics.checkNotNullParameter(amount, "amount");
      return new CashTransferDto(accNumber, amount);
   }

   // $FF: synthetic method
   public static CashTransferDto copy$default(CashTransferDto var0, String var1, BigDecimal var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.accNumber;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.amount;
      }

      return var0.copy(var1, var2);
   }

   @NotNull
   public String toString() {
      return "CashTransferDto(accNumber=" + this.accNumber + ", amount=" + this.amount + ")";
   }

   public int hashCode() {
      int result = this.accNumber.hashCode();
      result = result * 31 + this.amount.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof CashTransferDto)) {
         return false;
      } else {
         CashTransferDto var2 = (CashTransferDto)other;
         if (!Intrinsics.areEqual(this.accNumber, var2.accNumber)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.amount, var2.amount);
         }
      }
   }
}
