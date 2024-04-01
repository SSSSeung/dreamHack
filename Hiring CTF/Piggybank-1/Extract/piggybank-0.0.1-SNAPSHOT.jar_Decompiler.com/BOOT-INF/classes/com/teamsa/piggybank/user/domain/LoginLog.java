package com.teamsa.piggybank.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(
   name = "login_log"
)
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"},
   d2 = {"Lcom/teamsa/piggybank/user/domain/LoginLog;", "", "username", "", "loginDate", "Ljava/time/LocalDateTime;", "uuid", "id", "", "(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;I)V", "getId", "()I", "getLoginDate", "()Ljava/time/LocalDateTime;", "getUsername", "()Ljava/lang/String;", "getUuid", "piggybank"}
)
public class LoginLog {
   @Column(
      name = "username"
   )
   @NotNull
   private final String username;
   @Column(
      name = "loginDate",
      nullable = false
   )
   @NotNull
   private final LocalDateTime loginDate;
   @Column(
      name = "uuid",
      nullable = false
   )
   @NotNull
   private final String uuid;
   @Id
   @GeneratedValue
   private final int id;

   public LoginLog(@NotNull String username, @NotNull LocalDateTime loginDate, @NotNull String uuid, int id) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(loginDate, "loginDate");
      Intrinsics.checkNotNullParameter(uuid, "uuid");
      super();
      this.username = username;
      this.loginDate = loginDate;
      this.uuid = uuid;
      this.id = id;
   }

   // $FF: synthetic method
   public LoginLog(String var1, LocalDateTime var2, String var3, int var4, int var5, DefaultConstructorMarker var6) {
      if ((var5 & 1) != 0) {
         var1 = "";
      }

      if ((var5 & 2) != 0) {
         LocalDateTime var10000 = LocalDateTime.now();
         Intrinsics.checkNotNullExpressionValue(var10000, "now(...)");
         var2 = var10000;
      }

      if ((var5 & 4) != 0) {
         String var7 = UUID.randomUUID().toString();
         Intrinsics.checkNotNullExpressionValue(var7, "toString(...)");
         var3 = var7;
      }

      if ((var5 & 8) != 0) {
         var4 = 0;
      }

      this(var1, var2, var3, var4);
   }

   @NotNull
   public String getUsername() {
      return this.username;
   }

   @NotNull
   public LocalDateTime getLoginDate() {
      return this.loginDate;
   }

   @NotNull
   public String getUuid() {
      return this.uuid;
   }

   public int getId() {
      return this.id;
   }

   public LoginLog() {
      this((String)null, (LocalDateTime)null, (String)null, 0, 15, (DefaultConstructorMarker)null);
   }
}
