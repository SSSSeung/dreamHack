package com.teamsa.piggybank.shop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(
   name = "inventory"
)
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u001e\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0015"},
   d2 = {"Lcom/teamsa/piggybank/shop/domain/Inventory;", "", "productId", "", "productName", "", "userUuid", "id", "(JLjava/lang/String;Ljava/lang/String;J)V", "getId", "()J", "setId", "(J)V", "getProductId", "setProductId", "getProductName", "()Ljava/lang/String;", "setProductName", "(Ljava/lang/String;)V", "getUserUuid", "setUserUuid", "piggybank"}
)
public class Inventory {
   @Column(
      name = "productId"
   )
   private long productId;
   @Column(
      name = "productName"
   )
   @NotNull
   private String productName;
   @Column(
      name = "userUuid"
   )
   @NotNull
   private String userUuid;
   @Id
   @GeneratedValue
   @Column(
      name = "id"
   )
   private long id;

   public Inventory(long productId, @NotNull String productName, @NotNull String userUuid, long id) {
      Intrinsics.checkNotNullParameter(productName, "productName");
      Intrinsics.checkNotNullParameter(userUuid, "userUuid");
      super();
      this.productId = productId;
      this.productName = productName;
      this.userUuid = userUuid;
      this.id = id;
   }

   // $FF: synthetic method
   public Inventory(long var1, String var3, String var4, long var5, int var7, DefaultConstructorMarker var8) {
      if ((var7 & 1) != 0) {
         var1 = 0L;
      }

      if ((var7 & 2) != 0) {
         var3 = "";
      }

      if ((var7 & 4) != 0) {
         var4 = "";
      }

      if ((var7 & 8) != 0) {
         var5 = 0L;
      }

      this(var1, var3, var4, var5);
   }

   public long getProductId() {
      return this.productId;
   }

   public void setProductId(long <set-?>) {
      this.productId = var1;
   }

   @NotNull
   public String getProductName() {
      return this.productName;
   }

   public void setProductName(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.productName = var1;
   }

   @NotNull
   public String getUserUuid() {
      return this.userUuid;
   }

   public void setUserUuid(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.userUuid = var1;
   }

   public long getId() {
      return this.id;
   }

   public void setId(long <set-?>) {
      this.id = var1;
   }

   public Inventory() {
      this(0L, (String)null, (String)null, 0L, 15, (DefaultConstructorMarker)null);
   }
}
