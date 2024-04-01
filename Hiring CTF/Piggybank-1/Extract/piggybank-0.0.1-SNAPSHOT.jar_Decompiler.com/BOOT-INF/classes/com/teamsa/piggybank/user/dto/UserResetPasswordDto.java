package com.teamsa.piggybank.user.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"},
   d2 = {"Lcom/teamsa/piggybank/user/dto/UserResetPasswordDto;", "", "passResetToken", "", "firstPassword", "secondPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstPassword", "()Ljava/lang/String;", "getPassResetToken", "getSecondPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "piggybank"}
)
public final class UserResetPasswordDto {
   @NotNull
   private final String passResetToken;
   @NotNull
   private final String firstPassword;
   @NotNull
   private final String secondPassword;

   public UserResetPasswordDto(@NotNull String passResetToken, @NotNull String firstPassword, @NotNull String secondPassword) {
      Intrinsics.checkNotNullParameter(passResetToken, "passResetToken");
      Intrinsics.checkNotNullParameter(firstPassword, "firstPassword");
      Intrinsics.checkNotNullParameter(secondPassword, "secondPassword");
      super();
      this.passResetToken = passResetToken;
      this.firstPassword = firstPassword;
      this.secondPassword = secondPassword;
   }

   @NotNull
   public final String getPassResetToken() {
      return this.passResetToken;
   }

   @NotNull
   public final String getFirstPassword() {
      return this.firstPassword;
   }

   @NotNull
   public final String getSecondPassword() {
      return this.secondPassword;
   }

   @NotNull
   public final String component1() {
      return this.passResetToken;
   }

   @NotNull
   public final String component2() {
      return this.firstPassword;
   }

   @NotNull
   public final String component3() {
      return this.secondPassword;
   }

   @NotNull
   public final UserResetPasswordDto copy(@NotNull String passResetToken, @NotNull String firstPassword, @NotNull String secondPassword) {
      Intrinsics.checkNotNullParameter(passResetToken, "passResetToken");
      Intrinsics.checkNotNullParameter(firstPassword, "firstPassword");
      Intrinsics.checkNotNullParameter(secondPassword, "secondPassword");
      return new UserResetPasswordDto(passResetToken, firstPassword, secondPassword);
   }

   // $FF: synthetic method
   public static UserResetPasswordDto copy$default(UserResetPasswordDto var0, String var1, String var2, String var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.passResetToken;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.firstPassword;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.secondPassword;
      }

      return var0.copy(var1, var2, var3);
   }

   @NotNull
   public String toString() {
      return "UserResetPasswordDto(passResetToken=" + this.passResetToken + ", firstPassword=" + this.firstPassword + ", secondPassword=" + this.secondPassword + ")";
   }

   public int hashCode() {
      int result = this.passResetToken.hashCode();
      result = result * 31 + this.firstPassword.hashCode();
      result = result * 31 + this.secondPassword.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof UserResetPasswordDto)) {
         return false;
      } else {
         UserResetPasswordDto var2 = (UserResetPasswordDto)other;
         if (!Intrinsics.areEqual(this.passResetToken, var2.passResetToken)) {
            return false;
         } else if (!Intrinsics.areEqual(this.firstPassword, var2.firstPassword)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.secondPassword, var2.secondPassword);
         }
      }
   }
}
