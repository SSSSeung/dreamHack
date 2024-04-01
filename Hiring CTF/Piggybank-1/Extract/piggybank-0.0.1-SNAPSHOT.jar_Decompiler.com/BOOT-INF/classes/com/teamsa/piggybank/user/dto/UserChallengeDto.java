package com.teamsa.piggybank.user.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"},
   d2 = {"Lcom/teamsa/piggybank/user/dto/UserChallengeDto;", "", "challengeToken", "", "answers", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnswers", "()Ljava/lang/String;", "getChallengeToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "piggybank"}
)
public final class UserChallengeDto {
   @NotNull
   private final String challengeToken;
   @NotNull
   private final String answers;

   public UserChallengeDto(@NotNull String challengeToken, @NotNull String answers) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      Intrinsics.checkNotNullParameter(answers, "answers");
      super();
      this.challengeToken = challengeToken;
      this.answers = answers;
   }

   @NotNull
   public final String getChallengeToken() {
      return this.challengeToken;
   }

   @NotNull
   public final String getAnswers() {
      return this.answers;
   }

   @NotNull
   public final String component1() {
      return this.challengeToken;
   }

   @NotNull
   public final String component2() {
      return this.answers;
   }

   @NotNull
   public final UserChallengeDto copy(@NotNull String challengeToken, @NotNull String answers) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      Intrinsics.checkNotNullParameter(answers, "answers");
      return new UserChallengeDto(challengeToken, answers);
   }

   // $FF: synthetic method
   public static UserChallengeDto copy$default(UserChallengeDto var0, String var1, String var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.challengeToken;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.answers;
      }

      return var0.copy(var1, var2);
   }

   @NotNull
   public String toString() {
      return "UserChallengeDto(challengeToken=" + this.challengeToken + ", answers=" + this.answers + ")";
   }

   public int hashCode() {
      int result = this.challengeToken.hashCode();
      result = result * 31 + this.answers.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof UserChallengeDto)) {
         return false;
      } else {
         UserChallengeDto var2 = (UserChallengeDto)other;
         if (!Intrinsics.areEqual(this.challengeToken, var2.challengeToken)) {
            return false;
         } else {
            return Intrinsics.areEqual(this.answers, var2.answers);
         }
      }
   }
}
