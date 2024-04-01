package com.teamsa.piggybank;

import com.teamsa.piggybank.cash.service.krw.KRWCashService;
import com.teamsa.piggybank.cash.service.usd.USDCashService;
import com.teamsa.piggybank.shop.repository.ShopRepository;
import com.teamsa.piggybank.user.domain.User;
import com.teamsa.piggybank.user.repository.UserRepository;
import com.teamsa.piggybank.user.service.UserService;
import com.teamsa.piggybank.util.PasswordHashKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"},
   d2 = {"Lcom/teamsa/piggybank/Application;", "", "userRepository", "Lcom/teamsa/piggybank/user/repository/UserRepository;", "userService", "Lcom/teamsa/piggybank/user/service/UserService;", "krwCashService", "Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;", "usdCashService", "Lcom/teamsa/piggybank/cash/service/usd/USDCashService;", "flagProperties", "Lcom/teamsa/piggybank/FlagProperties;", "shopRepository", "Lcom/teamsa/piggybank/shop/repository/ShopRepository;", "(Lcom/teamsa/piggybank/user/repository/UserRepository;Lcom/teamsa/piggybank/user/service/UserService;Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;Lcom/teamsa/piggybank/cash/service/usd/USDCashService;Lcom/teamsa/piggybank/FlagProperties;Lcom/teamsa/piggybank/shop/repository/ShopRepository;)V", "init", "Lorg/springframework/boot/CommandLineRunner;", "piggybank"}
)
public class Application {
   @NotNull
   private final UserRepository userRepository;
   @NotNull
   private final UserService userService;
   @NotNull
   private final KRWCashService krwCashService;
   @NotNull
   private final USDCashService usdCashService;
   @NotNull
   private final FlagProperties flagProperties;
   @NotNull
   private final ShopRepository shopRepository;

   public Application(@NotNull UserRepository userRepository, @NotNull UserService userService, @NotNull KRWCashService krwCashService, @NotNull USDCashService usdCashService, @NotNull FlagProperties flagProperties, @NotNull ShopRepository shopRepository) {
      Intrinsics.checkNotNullParameter(userRepository, "userRepository");
      Intrinsics.checkNotNullParameter(userService, "userService");
      Intrinsics.checkNotNullParameter(krwCashService, "krwCashService");
      Intrinsics.checkNotNullParameter(usdCashService, "usdCashService");
      Intrinsics.checkNotNullParameter(flagProperties, "flagProperties");
      Intrinsics.checkNotNullParameter(shopRepository, "shopRepository");
      super();
      this.userRepository = userRepository;
      this.userService = userService;
      this.krwCashService = krwCashService;
      this.usdCashService = usdCashService;
      this.flagProperties = flagProperties;
      this.shopRepository = shopRepository;
   }

   @Bean
   @NotNull
   public CommandLineRunner init() {
      return Application::init$lambda$0;
   }

   private static final void init$lambda$0(Application this$0, String[] it) {
      Intrinsics.checkNotNullParameter(this$0, "this$0");
      String adminPassword = System.getenv("ADMIN_PASSWORD");
      if (adminPassword == null) {
         adminPassword = "";
      }

      UserRepository var10000 = this$0.userRepository;
      String var5 = PasswordHashKt.sha256(adminPassword);
      String var6 = this$0.flagProperties.getFlag();
      Object var7 = var10000.save(new User("admin", var5, "admin@piggybank.com", "관리자", var6, 100000000000000L, 82, (String)null, 128, (DefaultConstructorMarker)null));
      Intrinsics.checkNotNullExpressionValue(var7, "save(...)");
      User adminUser = (User)var7;
      String newSecureCode = this$0.userService.createSecureCode(adminUser.getId());
      this$0.userService.updateSecureCode(adminUser.getId(), newSecureCode);
      this$0.krwCashService.createBank(adminUser.getId());
      this$0.usdCashService.createBank(adminUser.getId());
   }
}
