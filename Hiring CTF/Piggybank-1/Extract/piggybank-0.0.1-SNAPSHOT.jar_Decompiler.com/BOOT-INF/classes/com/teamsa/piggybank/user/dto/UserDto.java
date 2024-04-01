package com.teamsa.piggybank.user.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"},
   d2 = {"Lcom/teamsa/piggybank/user/dto/UserDto;", "", "username", "", "email", "id", "realName", "countryCode", "", "memo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCountryCode", "()I", "getEmail", "()Ljava/lang/String;", "getId", "getMemo", "getRealName", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "piggybank"}
)
public final class UserDto {
   @NotNull
   private final String username;
   @NotNull
   private final String email;
   @NotNull
   private final String id;
   @NotNull
   private final String realName;
   private final int countryCode;
   @NotNull
   private final String memo;

   public UserDto(@NotNull String username, @NotNull String email, @NotNull String id, @NotNull String realName, int countryCode, @NotNull String memo) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(email, "email");
      Intrinsics.checkNotNullParameter(id, "id");
      Intrinsics.checkNotNullParameter(realName, "realName");
      Intrinsics.checkNotNullParameter(memo, "memo");
      super();
      this.username = username;
      this.email = email;
      this.id = id;
      this.realName = realName;
      this.countryCode = countryCode;
      this.memo = memo;
   }

   @NotNull
   public final String getUsername() {
      return this.username;
   }

   @NotNull
   public final String getEmail() {
      return this.email;
   }

   @NotNull
   public final String getId() {
      return this.id;
   }

   @NotNull
   public final String getRealName() {
      return this.realName;
   }

   public final int getCountryCode() {
      return this.countryCode;
   }

   @NotNull
   public final String getMemo() {
      return this.memo;
   }

   @NotNull
   public final String component1() {
      return this.username;
   }

   @NotNull
   public final String component2() {
      return this.email;
   }

   @NotNull
   public final String component3() {
      return this.id;
   }

   @NotNull
   public final String component4() {
      return this.realName;
   }

   public final int component5() {
      return this.countryCode;
   }

   @NotNull
   public final String component6() {
      return this.memo;
   }

   @NotNull
   public final UserDto copy(@NotNull String username, @NotNull String email, @NotNull String id, @NotNull String realName, int countryCode, @NotNull String memo) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(email, "email");
      Intrinsics.checkNotNullParameter(id, "id");
      Intrinsics.checkNotNullParameter(realName, "realName");
      Intrinsics.checkNotNullParameter(memo, "memo");
      return new UserDto(username, email, id, realName, countryCode, memo);
   }

   // $FF: synthetic method
   public static UserDto copy$default(UserDto var0, String var1, String var2, String var3, String var4, int var5, String var6, int var7, Object var8) {
      if ((var7 & 1) != 0) {
         var1 = var0.username;
      }

      if ((var7 & 2) != 0) {
         var2 = var0.email;
      }

      if ((var7 & 4) != 0) {
         var3 = var0.id;
      }

      if ((var7 & 8) != 0) {
         var4 = var0.realName;
      }

      if ((var7 & 16) != 0) {
         var5 = var0.countryCode;
      }

      if ((var7 & 32) != 0) {
         var6 = var0.memo;
      }

      return var0.copy(var1, var2, var3, var4, var5, var6);
   }

   @NotNull
   public String toString() {
      return "UserDto(username=" + this.username + ", email=" + this.email + ", id=" + this.id + ", realName=" + this.realName + ", countryCode=" + this.countryCode + ", memo=" + this.memo + ")";
   }

   public int hashCode() {
      int result = this.username.hashCode();
      result = result * 31 + this.email.hashCode();
      result = result * 31 + this.id.hashCode();
      result = result * 31 + this.realName.hashCode();
      result = result * 31 + Integer.hashCode(this.countryCode);
      result = result * 31 + this.memo.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof UserDto)) {
         return false;
      } else {
         UserDto var2 = (UserDto)other;
         if (!Intrinsics.areEqual(this.username, var2.username)) {
            return false;
         } else if (!Intrinsics.areEqual(this.email, var2.email)) {
            return false;
         } else if (!Intrinsics.areEqual(this.id, var2.id)) {
            return false;
         } else if (!Intrinsics.areEqual(this.realName, var2.realName)) {
            return false;
         } else if (this.countryCode != var2.countryCode) {
            return false;
         } else {
            return Intrinsics.areEqual(this.memo, var2.memo);
         }
      }
   }
}
