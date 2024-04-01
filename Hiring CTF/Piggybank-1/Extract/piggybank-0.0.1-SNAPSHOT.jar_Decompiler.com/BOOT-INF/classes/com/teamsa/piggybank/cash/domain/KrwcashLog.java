package com.teamsa.piggybank.cash.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(
   name = "krw_cash_log"
)
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"},
   d2 = {"Lcom/teamsa/piggybank/cash/domain/KrwcashLog;", "", "senderAccNumber", "", "receiverAccNumber", "amount", "Ljava/math/BigDecimal;", "category", "senderId", "receiverId", "transactionDate", "Ljava/time/LocalDateTime;", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;J)V", "getAmount", "()Ljava/math/BigDecimal;", "getCategory", "()Ljava/lang/String;", "getId", "()J", "getReceiverAccNumber", "getReceiverId", "getSenderAccNumber", "getSenderId", "getTransactionDate", "()Ljava/time/LocalDateTime;", "piggybank"}
)
public class KrwcashLog {
   @Column(
      name = "senderAccNumber"
   )
   @NotNull
   private final String senderAccNumber;
   @Column(
      name = "receiverAccNumber"
   )
   @NotNull
   private final String receiverAccNumber;
   @Column(
      name = "amount"
   )
   @NotNull
   private final BigDecimal amount;
   @Column(
      name = "category"
   )
   @NotNull
   private final String category;
   @Column(
      name = "senderId",
      nullable = false
   )
   @NotNull
   private final String senderId;
   @Column(
      name = "receiverId",
      nullable = false
   )
   @NotNull
   private final String receiverId;
   @Column(
      name = "transactionDate",
      nullable = false
   )
   @NotNull
   private final LocalDateTime transactionDate;
   @Id
   @GeneratedValue
   private final long id;

   public KrwcashLog(@NotNull String senderAccNumber, @NotNull String receiverAccNumber, @NotNull BigDecimal amount, @NotNull String category, @NotNull String senderId, @NotNull String receiverId, @NotNull LocalDateTime transactionDate, long id) {
      Intrinsics.checkNotNullParameter(senderAccNumber, "senderAccNumber");
      Intrinsics.checkNotNullParameter(receiverAccNumber, "receiverAccNumber");
      Intrinsics.checkNotNullParameter(amount, "amount");
      Intrinsics.checkNotNullParameter(category, "category");
      Intrinsics.checkNotNullParameter(senderId, "senderId");
      Intrinsics.checkNotNullParameter(receiverId, "receiverId");
      Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
      super();
      this.senderAccNumber = senderAccNumber;
      this.receiverAccNumber = receiverAccNumber;
      this.amount = amount;
      this.category = category;
      this.senderId = senderId;
      this.receiverId = receiverId;
      this.transactionDate = transactionDate;
      this.id = id;
   }

   // $FF: synthetic method
   public KrwcashLog(String var1, String var2, BigDecimal var3, String var4, String var5, String var6, LocalDateTime var7, long var8, int var10, DefaultConstructorMarker var11) {
      if ((var10 & 1) != 0) {
         var1 = "";
      }

      if ((var10 & 2) != 0) {
         var2 = "";
      }

      if ((var10 & 4) != 0) {
         BigDecimal var10000 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10000, "ZERO");
         var3 = var10000;
      }

      if ((var10 & 8) != 0) {
         var4 = "";
      }

      String var12;
      if ((var10 & 16) != 0) {
         var12 = UUID.randomUUID().toString();
         Intrinsics.checkNotNullExpressionValue(var12, "toString(...)");
         var5 = var12;
      }

      if ((var10 & 32) != 0) {
         var12 = UUID.randomUUID().toString();
         Intrinsics.checkNotNullExpressionValue(var12, "toString(...)");
         var6 = var12;
      }

      if ((var10 & 64) != 0) {
         LocalDateTime var13 = LocalDateTime.now();
         Intrinsics.checkNotNullExpressionValue(var13, "now(...)");
         var7 = var13;
      }

      if ((var10 & 128) != 0) {
         var8 = 0L;
      }

      this(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @NotNull
   public String getSenderAccNumber() {
      return this.senderAccNumber;
   }

   @NotNull
   public String getReceiverAccNumber() {
      return this.receiverAccNumber;
   }

   @NotNull
   public BigDecimal getAmount() {
      return this.amount;
   }

   @NotNull
   public String getCategory() {
      return this.category;
   }

   @NotNull
   public String getSenderId() {
      return this.senderId;
   }

   @NotNull
   public String getReceiverId() {
      return this.receiverId;
   }

   @NotNull
   public LocalDateTime getTransactionDate() {
      return this.transactionDate;
   }

   public long getId() {
      return this.id;
   }

   public KrwcashLog() {
      this((String)null, (String)null, (BigDecimal)null, (String)null, (String)null, (String)null, (LocalDateTime)null, 0L, 255, (DefaultConstructorMarker)null);
   }
}
