package com.teamsa.piggybank.user.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0017"},
   d2 = {"Lcom/teamsa/piggybank/user/dto/UserRegisterDto;", "", "username", "", "password", "email", "realName", "regNumber", "", "countryCode", "", "memo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;)V", "getCountryCode", "()I", "getEmail", "()Ljava/lang/String;", "getMemo", "getPassword", "getRealName", "getRegNumber", "()J", "getUsername", "piggybank"}
)
public final class UserRegisterDto {
   @NotNull
   private final String username;
   @NotNull
   private final String password;
   @NotNull
   private final String email;
   @NotNull
   private final String realName;
   private final long regNumber;
   private final int countryCode;
   @NotNull
   private final String memo;

   public UserRegisterDto(@NotNull String username, @NotNull String password, @NotNull String email, @NotNull String realName, long regNumber, int countryCode, @NotNull String memo) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(password, "password");
      Intrinsics.checkNotNullParameter(email, "email");
      Intrinsics.checkNotNullParameter(realName, "realName");
      Intrinsics.checkNotNullParameter(memo, "memo");
      super();
      this.username = username;
      this.password = password;
      this.email = email;
      this.realName = realName;
      this.regNumber = regNumber;
      this.countryCode = countryCode;
      this.memo = memo;
   }

   @NotNull
   public final String getUsername() {
      return this.username;
   }

   @NotNull
   public final String getPassword() {
      return this.password;
   }

   @NotNull
   public final String getEmail() {
      return this.email;
   }

   @NotNull
   public final String getRealName() {
      return this.realName;
   }

   public final long getRegNumber() {
      return this.regNumber;
   }

   public final int getCountryCode() {
      return this.countryCode;
   }

   @NotNull
   public final String getMemo() {
      return this.memo;
   }
}
