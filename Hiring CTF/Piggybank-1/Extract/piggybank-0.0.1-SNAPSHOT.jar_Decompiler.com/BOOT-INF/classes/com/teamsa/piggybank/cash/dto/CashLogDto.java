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
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "},
   d2 = {"Lcom/teamsa/piggybank/cash/dto/CashLogDto;", "", "amount", "Ljava/math/BigDecimal;", "category", "", "receiver_acc_number", "receiver_id", "sender_acc_number", "sender_id", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getCategory", "()Ljava/lang/String;", "getReceiver_acc_number", "getReceiver_id", "getSender_acc_number", "getSender_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "piggybank"}
)
public final class CashLogDto {
   @NotNull
   private final BigDecimal amount;
   @NotNull
   private final String category;
   @NotNull
   private final String receiver_acc_number;
   @NotNull
   private final String receiver_id;
   @NotNull
   private final String sender_acc_number;
   @NotNull
   private final String sender_id;

   public CashLogDto(@NotNull BigDecimal amount, @NotNull String category, @NotNull String receiver_acc_number, @NotNull String receiver_id, @NotNull String sender_acc_number, @NotNull String sender_id) {
      Intrinsics.checkNotNullParameter(amount, "amount");
      Intrinsics.checkNotNullParameter(category, "category");
      Intrinsics.checkNotNullParameter(receiver_acc_number, "receiver_acc_number");
      Intrinsics.checkNotNullParameter(receiver_id, "receiver_id");
      Intrinsics.checkNotNullParameter(sender_acc_number, "sender_acc_number");
      Intrinsics.checkNotNullParameter(sender_id, "sender_id");
      super();
      this.amount = amount;
      this.category = category;
      this.receiver_acc_number = receiver_acc_number;
      this.receiver_id = receiver_id;
      this.sender_acc_number = sender_acc_number;
      this.sender_id = sender_id;
   }

   @NotNull
   public final BigDecimal getAmount() {
      return this.amount;
   }

   @NotNull
   public final String getCategory() {
      return this.category;
   }

   @NotNull
   public final String getReceiver_acc_number() {
      return this.receiver_acc_number;
   }

   @NotNull
   public final String getReceiver_id() {
      return this.receiver_id;
   }

   @NotNull
   public final String getSender_acc_number() {
      return this.sender_acc_number;
   }

   @NotNull
   public final String getSender_id() {
      return this.sender_id;
   }

   @NotNull
   public final BigDecimal component1() {
      return this.amount;
   }

   @NotNull
   public final String component2() {
      return this.category;
   }

   @NotNull
   public final String component3() {
      return this.receiver_acc_number;
   }

   @NotNull
   public final String component4() {
      return this.receiver_id;
   }

   @NotNull
   public final String component5() {
      return this.sender_acc_number;
   }

   @NotNull
   public final String component6() {
      return this.sender_id;
   }

   @NotNull
   public final CashLogDto copy(@NotNull BigDecimal amount, @NotNull String category, @NotNull String receiver_acc_number, @NotNull String receiver_id, @NotNull String sender_acc_number, @NotNull String sender_id) {
      Intrinsics.checkNotNullParameter(amount, "amount");
      Intrinsics.checkNotNullParameter(category, "category");
      Intrinsics.checkNotNullParameter(receiver_acc_number, "receiver_acc_number");
      Intrinsics.checkNotNullParameter(receiver_id, "receiver_id");
      Intrinsics.checkNotNullParameter(sender_acc_number, "sender_acc_number");
      Intrinsics.checkNotNullParameter(sender_id, "sender_id");
      return new CashLogDto(amount, category, receiver_acc_number, receiver_id, sender_acc_number, sender_id);
   }

   // $FF: synthetic method
   public static CashLogDto copy$default(CashLogDto var0, BigDecimal var1, String var2, String var3, String var4, String var5, String var6, int var7, Object var8) {
      if ((var7 & 1) != 0) {
         var1 = var0.amount;
      }

      if ((var7 & 2) != 0) {
         var2 = var0.category;
      }

      if ((var7 & 4) != 0) {
         var3 = var0.receiver_acc_number;
      }

      if ((var7 & 8) != 0) {
         var4 = var0.receiver_id;
      }

      if ((var7 & 16) != 0) {
         var5 = var0.sender_acc_number;
      }

      if ((var7 & 32) != 0) {
         var6 = var0.sender_id;
      }

      return var0.copy(var1, var2, var3, var4, var5, var6);
   }

   @NotNull
   public String toString() {
      return "CashLogDto(amount=" + this.amount + ", category=" + this.category + ", receiver_acc_number=" + this.receiver_acc_number + ", receiver_id=" + this.receiver_id + ", sender_acc_number=" + this.sender_acc_number + ", sender_id=" + this.sender_id + ")";
   }

   public int hashCode() {
      int result = this.amount.hashCode();
      result = result * 31 + this.category.hashCode();
      result = result * 31 + this.receiver_acc_number.hashCode();
      result = result * 31 + this.receiver_id.hashCode();
      result = result * 31 + this.sender_acc_number.hashCode();
      result = result * 31 + this.sender_id.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof CashLogDto)) {
         return false;
      } else {
         CashLogDto var2 = (CashLogDto)other;
         if (!Intrinsics.areEqual(this.amount, var2.amount)) {
            return false;
         } else if (!Intrinsics.areEqual(this.category, var2.category)) {
            return false;
         } else if (!Intrinsics.areEqual(this.receiver_acc_number, var2.receiver_acc_number)) {
            return false;
         } else if (!Intrinsics.areEqual(this.receiver_id, var2.receiver_id)) {
            return false;
         } else if (!Intrinsics.areEqual(this.sender_acc_number, var2.sender_acc_number)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.sender_id, var2.sender_id);
         }
      }
   }
}
