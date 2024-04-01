package com.teamsa.piggybank.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(
   name = "users"
)
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0003H\u0016J\u0010\u0010)\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001e\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015¨\u0006*"},
   d2 = {"Lcom/teamsa/piggybank/user/domain/User;", "", "username", "", "password", "email", "realName", "memo", "regNumber", "", "countryCode", "", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;)V", "getCountryCode", "()I", "setCountryCode", "(I)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getId", "getMemo", "setMemo", "getPassword", "setPassword", "getRealName", "setRealName", "getRegNumber", "()J", "setRegNumber", "(J)V", "secureCode", "getSecureCode", "setSecureCode", "getUsername", "setUsername", "updatePassword", "", "newPassword", "updateSecureCode", "piggybank"}
)
public class User {
   @Column(
      name = "username",
      nullable = false,
      length = 42
   )
   @NotNull
   private String username;
   @Column(
      name = "password",
      nullable = false,
      length = 64
   )
   @NotNull
   private String password;
   @Column(
      name = "email",
      nullable = false,
      length = 60
   )
   @NotNull
   private String email;
   @Column(
      name = "realName",
      nullable = false,
      length = 20
   )
   @NotNull
   private String realName;
   @Column(
      name = "memo",
      nullable = false,
      length = 70
   )
   @NotNull
   private String memo;
   @Column(
      name = "regNumber",
      nullable = false
   )
   private long regNumber;
   @Column(
      name = "countryCode",
      nullable = false
   )
   private int countryCode;
   @Id
   @Column(
      name = "id",
      nullable = false
   )
   @NotNull
   private final String id;
   @Column(
      name = "secureCode",
      nullable = true
   )
   @NotNull
   private String secureCode;

   public User(@NotNull String username, @NotNull String password, @NotNull String email, @NotNull String realName, @NotNull String memo, long regNumber, int countryCode, @NotNull String id) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(password, "password");
      Intrinsics.checkNotNullParameter(email, "email");
      Intrinsics.checkNotNullParameter(realName, "realName");
      Intrinsics.checkNotNullParameter(memo, "memo");
      Intrinsics.checkNotNullParameter(id, "id");
      super();
      this.username = username;
      this.password = password;
      this.email = email;
      this.realName = realName;
      this.memo = memo;
      this.regNumber = regNumber;
      this.countryCode = countryCode;
      this.id = id;
      this.secureCode = "";
   }

   // $FF: synthetic method
   public User(String var1, String var2, String var3, String var4, String var5, long var6, int var8, String var9, int var10, DefaultConstructorMarker var11) {
      if ((var10 & 1) != 0) {
         var1 = "";
      }

      if ((var10 & 2) != 0) {
         var2 = "";
      }

      if ((var10 & 4) != 0) {
         var3 = "";
      }

      if ((var10 & 8) != 0) {
         var4 = "";
      }

      if ((var10 & 16) != 0) {
         var5 = "";
      }

      if ((var10 & 32) != 0) {
         var6 = 0L;
      }

      if ((var10 & 64) != 0) {
         var8 = 0;
      }

      if ((var10 & 128) != 0) {
         String var10000 = UUID.randomUUID().toString();
         Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
         var9 = var10000;
      }

      this(var1, var2, var3, var4, var5, var6, var8, var9);
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
   public String getPassword() {
      return this.password;
   }

   public void setPassword(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.password = var1;
   }

   @NotNull
   public String getEmail() {
      return this.email;
   }

   public void setEmail(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.email = var1;
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
   public String getMemo() {
      return this.memo;
   }

   public void setMemo(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.memo = var1;
   }

   public long getRegNumber() {
      return this.regNumber;
   }

   public void setRegNumber(long <set-?>) {
      this.regNumber = var1;
   }

   public int getCountryCode() {
      return this.countryCode;
   }

   public void setCountryCode(int <set-?>) {
      this.countryCode = var1;
   }

   @NotNull
   public String getId() {
      return this.id;
   }

   @NotNull
   public String getSecureCode() {
      return this.secureCode;
   }

   public void setSecureCode(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.secureCode = var1;
   }

   public void updateSecureCode(@NotNull String secureCode) {
      Intrinsics.checkNotNullParameter(secureCode, "secureCode");
      this.setSecureCode(secureCode);
   }

   public void updatePassword(@NotNull String newPassword) {
      Intrinsics.checkNotNullParameter(newPassword, "newPassword");
      this.setPassword(newPassword);
   }

   public User() {
      this((String)null, (String)null, (String)null, (String)null, (String)null, 0L, 0, (String)null, 255, (DefaultConstructorMarker)null);
   }
}
