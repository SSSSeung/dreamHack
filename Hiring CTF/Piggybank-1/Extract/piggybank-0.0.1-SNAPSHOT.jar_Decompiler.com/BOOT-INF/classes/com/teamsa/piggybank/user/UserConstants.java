package com.teamsa.piggybank.user;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"},
   d2 = {"Lcom/teamsa/piggybank/user/UserConstants;", "", "()V", "ADMIN_EMAIL", "", "ADMIN_REALNAME", "ADMIN_USERNAME", "MAX_EMAIL_LENGTH", "", "MAX_MEMO_LENGTH", "MAX_PASSWORD_LENGTH", "MAX_REALNAME_LENGTH", "MAX_USERNAME_LENGTH", "MAX_USER_LIMIT", "MIN_EMAIL_LENGTH", "MIN_MEMO_LENGTH", "MIN_PASSWORD_LENGTH", "MIN_REALNAME_LENGTH", "MIN_USERNAME_LENGTH", "NEW_MEMBER_REWARD", "REGNUMBER_LENGTH", "SECURE_CODE_INDEX", "getSECURE_CODE_INDEX", "()I", "SECURE_CODE_LIST", "", "getSECURE_CODE_LIST", "()Ljava/util/List;", "piggybank"}
)
public final class UserConstants {
   @NotNull
   public static final UserConstants INSTANCE = new UserConstants();
   public static final int MIN_USERNAME_LENGTH = 4;
   public static final int MAX_USERNAME_LENGTH = 42;
   public static final int MIN_PASSWORD_LENGTH = 8;
   public static final int MAX_PASSWORD_LENGTH = 64;
   public static final int MIN_EMAIL_LENGTH = 10;
   public static final int MAX_EMAIL_LENGTH = 60;
   public static final int MIN_REALNAME_LENGTH = 2;
   public static final int MAX_REALNAME_LENGTH = 20;
   public static final int MIN_MEMO_LENGTH = 0;
   public static final int MAX_MEMO_LENGTH = 70;
   public static final int REGNUMBER_LENGTH = 15;
   public static final int MAX_USER_LIMIT = 50;
   @NotNull
   public static final String ADMIN_USERNAME = "admin";
   @NotNull
   public static final String ADMIN_EMAIL = "admin@piggybank.com";
   @NotNull
   public static final String ADMIN_REALNAME = "관리자";
   public static final int NEW_MEMBER_REWARD = 10000;
   @NotNull
   private static final List<String> SECURE_CODE_LIST;
   private static final int SECURE_CODE_INDEX;

   private UserConstants() {
   }

   @NotNull
   public final List<String> getSECURE_CODE_LIST() {
      return SECURE_CODE_LIST;
   }

   public final int getSECURE_CODE_INDEX() {
      return SECURE_CODE_INDEX;
   }

   static {
      String[] var0 = new String[]{"refuse", "sector", "dentist", "release", "tenant", "lunch", "code", "partner", "chicken", "ribbon", "apple", "cargo", "damage", "enjoy", "index", "theori", "dreamhack", "across", "idea", "noble"};
      SECURE_CODE_LIST = CollectionsKt.mutableListOf(var0);
      SECURE_CODE_INDEX = 2;
   }
}
