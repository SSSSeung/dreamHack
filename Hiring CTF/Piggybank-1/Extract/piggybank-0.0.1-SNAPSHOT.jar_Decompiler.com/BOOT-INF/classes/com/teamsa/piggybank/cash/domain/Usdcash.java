package com.teamsa.piggybank.cash.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(
   name = "usd_cash"
)
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0017\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bR\u001e\u0010\t\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u001e\u0010\b\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"},
   d2 = {"Lcom/teamsa/piggybank/cash/domain/Usdcash;", "", "version", "", "username", "", "balance", "Ljava/math/BigDecimal;", "realName", "accNumber", "id", "(JLjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccNumber", "()Ljava/lang/String;", "setAccNumber", "(Ljava/lang/String;)V", "getBalance", "()Ljava/math/BigDecimal;", "setBalance", "(Ljava/math/BigDecimal;)V", "getId", "getRealName", "setRealName", "getUsername", "setUsername", "getVersion", "()J", "setVersion", "(J)V", "piggybank"}
)
public class Usdcash {
   @Version
   private long version;
   @Column(
      name = "username",
      length = 42
   )
   @NotNull
   private String username;
   @Column(
      name = "balance"
   )
   @NotNull
   private BigDecimal balance;
   @Column(
      name = "realName",
      nullable = false
   )
   @NotNull
   private String realName;
   @Column(
      name = "accNumber"
   )
   @NotNull
   private String accNumber;
   @Id
   @Column(
      name = "id",
      nullable = false
   )
   @NotNull
   private final String id;

   public Usdcash(long version, @NotNull String username, @NotNull BigDecimal balance, @NotNull String realName, @NotNull String accNumber, @NotNull String id) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(balance, "balance");
      Intrinsics.checkNotNullParameter(realName, "realName");
      Intrinsics.checkNotNullParameter(accNumber, "accNumber");
      Intrinsics.checkNotNullParameter(id, "id");
      super();
      this.version = version;
      this.username = username;
      this.balance = balance;
      this.realName = realName;
      this.accNumber = accNumber;
      this.id = id;
   }

   // $FF: synthetic method
   public Usdcash(long var1, String var3, BigDecimal var4, String var5, String var6, String var7, int var8, DefaultConstructorMarker var9) {
      if ((var8 & 1) != 0) {
         var1 = 0L;
      }

      if ((var8 & 2) != 0) {
         var3 = "";
      }

      if ((var8 & 4) != 0) {
         var4 = new BigDecimal(0);
      }

      if ((var8 & 8) != 0) {
         var5 = "";
      }

      String var10000;
      if ((var8 & 16) != 0) {
         var10000 = UUID.randomUUID().toString();
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         var6 = var10000;
      }

      if ((var8 & 32) != 0) {
         var10000 = UUID.randomUUID().toString();
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         var7 = var10000;
      }

      this(var1, var3, var4, var5, var6, var7);
   }

   public long getVersion() {
      return this.version;
   }

   public void setVersion(long <set-?>) {
      this.version = var1;
   }

   @NotNull
   public String getUsername() {
      return this.username;
   }

   public void setUsername(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.username = var1;
   }

   @NotNull
   public BigDecimal getBalance() {
      return this.balance;
   }

   public void setBalance(@NotNull BigDecimal <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.balance = var1;
   }

   @NotNull
   public String getRealName() {
      return this.realName;
   }

   public void setRealName(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.realName = var1;
   }

   @NotNull
   public String getAccNumber() {
      return this.accNumber;
   }

   public void setAccNumber(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.accNumber = var1;
   }

   @NotNull
   public String getId() {
      return this.id;
   }

   public Usdcash() {
      this(0L, (String)null, (BigDecimal)null, (String)null, (String)null, (String)null, 63, (DefaultConstructorMarker)null);
   }
}
