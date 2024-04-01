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
   name = "cash_exchange_log"
)
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001b"},
   d2 = {"Lcom/teamsa/piggybank/cash/domain/CashExchangeLog;", "", "src", "", "dst", "srcPrice", "Ljava/math/BigDecimal;", "dstPrice", "amount", "subjectId", "exchangeDate", "Ljava/time/LocalDateTime;", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/time/LocalDateTime;J)V", "getAmount", "()Ljava/math/BigDecimal;", "getDst", "()Ljava/lang/String;", "getDstPrice", "getExchangeDate", "()Ljava/time/LocalDateTime;", "getId", "()J", "getSrc", "getSrcPrice", "getSubjectId", "piggybank"}
)
public class CashExchangeLog {
   @Column(
      name = "src"
   )
   @NotNull
   private final String src;
   @Column(
      name = "dst"
   )
   @NotNull
   private final String dst;
   @Column(
      name = "srcPrice"
   )
   @NotNull
   private final BigDecimal srcPrice;
   @Column(
      name = "dstPrice"
   )
   @NotNull
   private final BigDecimal dstPrice;
   @Column(
      name = "amount"
   )
   @NotNull
   private final BigDecimal amount;
   @Column(
      name = "subjectId",
      nullable = false
   )
   @NotNull
   private final String subjectId;
   @Column(
      name = "exchangeDate",
      nullable = false
   )
   @NotNull
   private final LocalDateTime exchangeDate;
   @Id
   @GeneratedValue
   private final long id;

   public CashExchangeLog(@NotNull String src, @NotNull String dst, @NotNull BigDecimal srcPrice, @NotNull BigDecimal dstPrice, @NotNull BigDecimal amount, @NotNull String subjectId, @NotNull LocalDateTime exchangeDate, long id) {
      Intrinsics.checkNotNullParameter(src, "src");
      Intrinsics.checkNotNullParameter(dst, "dst");
      Intrinsics.checkNotNullParameter(srcPrice, "srcPrice");
      Intrinsics.checkNotNullParameter(dstPrice, "dstPrice");
      Intrinsics.checkNotNullParameter(amount, "amount");
      Intrinsics.checkNotNullParameter(subjectId, "subjectId");
      Intrinsics.checkNotNullParameter(exchangeDate, "exchangeDate");
      super();
      this.src = src;
      this.dst = dst;
      this.srcPrice = srcPrice;
      this.dstPrice = dstPrice;
      this.amount = amount;
      this.subjectId = subjectId;
      this.exchangeDate = exchangeDate;
      this.id = id;
   }

   // $FF: synthetic method
   public CashExchangeLog(String var1, String var2, BigDecimal var3, BigDecimal var4, BigDecimal var5, String var6, LocalDateTime var7, long var8, int var10, DefaultConstructorMarker var11) {
      if ((var10 & 1) != 0) {
         var1 = "";
      }

      if ((var10 & 2) != 0) {
         var2 = "";
      }

      BigDecimal var10000;
      if ((var10 & 4) != 0) {
         var10000 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10000, "ZERO");
         var3 = var10000;
      }

      if ((var10 & 8) != 0) {
         var10000 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10000, "ZERO");
         var4 = var10000;
      }

      if ((var10 & 16) != 0) {
         var10000 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10000, "ZERO");
         var5 = var10000;
      }

      if ((var10 & 32) != 0) {
         String var12 = UUID.randomUUID().toString();
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
   public String getSrc() {
      return this.src;
   }

   @NotNull
   public String getDst() {
      return this.dst;
   }

   @NotNull
   public BigDecimal getSrcPrice() {
      return this.srcPrice;
   }

   @NotNull
   public BigDecimal getDstPrice() {
      return this.dstPrice;
   }

   @NotNull
   public BigDecimal getAmount() {
      return this.amount;
   }

   @NotNull
   public String getSubjectId() {
      return this.subjectId;
   }

   @NotNull
   public LocalDateTime getExchangeDate() {
      return this.exchangeDate;
   }

   public long getId() {
      return this.id;
   }

   public CashExchangeLog() {
      this((String)null, (String)null, (BigDecimal)null, (BigDecimal)null, (BigDecimal)null, (String)null, (LocalDateTime)null, 0L, 255, (DefaultConstructorMarker)null);
   }
}
