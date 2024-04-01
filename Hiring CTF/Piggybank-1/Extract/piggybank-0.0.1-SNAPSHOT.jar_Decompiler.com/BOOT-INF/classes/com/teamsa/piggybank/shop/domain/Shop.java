package com.teamsa.piggybank.shop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(
   name = "shop"
)
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001e\u0010\u0006\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"},
   d2 = {"Lcom/teamsa/piggybank/shop/domain/Shop;", "", "productName", "", "price", "Ljava/math/BigDecimal;", "description", "owner", "id", "", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;J)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getOwner", "setOwner", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getProductName", "setProductName", "piggybank"}
)
public class Shop {
   @Column(
      name = "productName"
   )
   @NotNull
   private String productName;
   @Column(
      name = "price"
   )
   @NotNull
   private BigDecimal price;
   @Column(
      name = "description"
   )
   @NotNull
   private String description;
   @Column(
      name = "owner"
   )
   @NotNull
   private String owner;
   @Id
   @GeneratedValue
   @Column(
      name = "id"
   )
   private long id;

   public Shop(@NotNull String productName, @NotNull BigDecimal price, @NotNull String description, @NotNull String owner, long id) {
      Intrinsics.checkNotNullParameter(productName, "productName");
      Intrinsics.checkNotNullParameter(price, "price");
      Intrinsics.checkNotNullParameter(description, "description");
      Intrinsics.checkNotNullParameter(owner, "owner");
      super();
      this.productName = productName;
      this.price = price;
      this.description = description;
      this.owner = owner;
      this.id = id;
   }

   // $FF: synthetic method
   public Shop(String var1, BigDecimal var2, String var3, String var4, long var5, int var7, DefaultConstructorMarker var8) {
      if ((var7 & 1) != 0) {
         var1 = "";
      }

      if ((var7 & 2) != 0) {
         BigDecimal var10000 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10000, "ZERO");
         var2 = var10000;
      }

      if ((var7 & 4) != 0) {
         var3 = "";
      }

      if ((var7 & 8) != 0) {
         var4 = "";
      }

      if ((var7 & 16) != 0) {
         var5 = 0L;
      }

      this(var1, var2, var3, var4, var5);
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
   public BigDecimal getPrice() {
      return this.price;
   }

   public void setPrice(@NotNull BigDecimal <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.price = var1;
   }

   @NotNull
   public String getDescription() {
      return this.description;
   }

   public void setDescription(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.description = var1;
   }

   @NotNull
   public String getOwner() {
      return this.owner;
   }

   public void setOwner(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.owner = var1;
   }

   public long getId() {
      return this.id;
   }

   public void setId(long <set-?>) {
      this.id = var1;
   }

   public Shop() {
      this((String)null, (BigDecimal)null, (String)null, (String)null, 0L, 31, (DefaultConstructorMarker)null);
   }
}
