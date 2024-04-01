package com.teamsa.piggybank.user.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"},
   d2 = {"Lcom/teamsa/piggybank/user/dto/UserLoginDto;", "", "username", "", "password", "next", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNext", "()Ljava/lang/String;", "getPassword", "getUsername", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "piggybank"}
)
public final class UserLoginDto {
   @NotNull
   private final String username;
   @NotNull
   private final String password;
   @Nullable
   private final String next;

   public UserLoginDto(@NotNull String username, @NotNull String password, @Nullable String next) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(password, "password");
      super();
      this.username = username;
      this.password = password;
      this.next = next;
   }

   @NotNull
   public final String getUsername() {
      return this.username;
   }

   @NotNull
   public final String getPassword() {
      return this.password;
   }

   @Nullable
   public final String getNext() {
      return this.next;
   }

   @NotNull
   public final String component1() {
      return this.username;
   }

   @NotNull
   public final String component2() {
      return this.password;
   }

   @Nullable
   public final String component3() {
      return this.next;
   }

   @NotNull
   public final UserLoginDto copy(@NotNull String username, @NotNull String password, @Nullable String next) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(password, "password");
      return new UserLoginDto(username, password, next);
   }

   // $FF: synthetic method
   public static UserLoginDto copy$default(UserLoginDto var0, String var1, String var2, String var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.username;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.password;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.next;
      }

      return var0.copy(var1, var2, var3);
   }

   @NotNull
   public String toString() {
      return "UserLoginDto(username=" + this.username + ", password=" + this.password + ", next=" + this.next + ")";
   }

   public int hashCode() {
      int result = this.username.hashCode();
      result = result * 31 + this.password.hashCode();
      result = result * 31 + (this.next == null ? 0 : this.next.hashCode());
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof UserLoginDto)) {
         return false;
      } else {
         UserLoginDto var2 = (UserLoginDto)other;
         if (!Intrinsics.areEqual(this.username, var2.username)) {
            return false;
         } else if (!Intrinsics.areEqual(this.password, var2.password)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.next, var2.next);
         }
      }
   }
}
