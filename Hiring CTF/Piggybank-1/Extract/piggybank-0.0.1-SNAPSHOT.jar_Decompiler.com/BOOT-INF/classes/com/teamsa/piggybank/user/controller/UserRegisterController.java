package com.teamsa.piggybank.user.controller;

import com.teamsa.piggybank.cash.service.CashService;
import com.teamsa.piggybank.cash.service.krw.KRWCashService;
import com.teamsa.piggybank.user.dto.UserRegisterDto;
import com.teamsa.piggybank.user.service.UserService;
import com.teamsa.piggybank.user.service.UserServiceException;
import jakarta.servlet.http.HttpSession;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/user"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J \u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"},
   d2 = {"Lcom/teamsa/piggybank/user/controller/UserRegisterController;", "", "userService", "Lcom/teamsa/piggybank/user/service/UserService;", "krwcashService", "Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;", "cashService", "Lcom/teamsa/piggybank/cash/service/CashService;", "(Lcom/teamsa/piggybank/user/service/UserService;Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;Lcom/teamsa/piggybank/cash/service/CashService;)V", "doSignUp", "", "data", "Lcom/teamsa/piggybank/user/dto/UserRegisterDto;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "authUser", "Ljakarta/servlet/http/HttpSession;", "model", "Lorg/springframework/ui/Model;", "getRegister", "piggybank"}
)
public class UserRegisterController {
   @NotNull
   private final UserService userService;
   @NotNull
   private final KRWCashService krwcashService;
   @NotNull
   private final CashService cashService;

   public UserRegisterController(@NotNull UserService userService, @NotNull KRWCashService krwcashService, @NotNull CashService cashService) {
      Intrinsics.checkNotNullParameter(userService, "userService");
      Intrinsics.checkNotNullParameter(krwcashService, "krwcashService");
      Intrinsics.checkNotNullParameter(cashService, "cashService");
      super();
      this.userService = userService;
      this.krwcashService = krwcashService;
      this.cashService = cashService;
   }

   @GetMapping({"/signup"})
   @NotNull
   public String getRegister(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      return "user/signup";
   }

   @PostMapping({"/signup"})
   @NotNull
   public String doSignUp(@ModelAttribute @NotNull UserRegisterDto data, @NotNull RedirectAttributes redirectAttrs, @NotNull HttpSession authUser, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(data, "data");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(model, "model");

      try {
         Pair var5 = this.userService.createUser(data.getUsername(), data.getPassword(), data.getEmail(), data.getRealName(), data.getRegNumber(), data.getCountryCode(), data.getMemo());
         String newSecureCode = (String)var5.component1();
         String uuid = (String)var5.component2();
         String adminUuid = this.cashService.getAdminUuid("admin");
         this.krwcashService.createBank(uuid);
         this.krwcashService.rewardForNewMember(adminUuid, uuid, new BigDecimal(10000));
         model.addAttribute("secure_code", newSecureCode);
         return "user/welcome";
      } catch (UserServiceException var9) {
         ModelExtensionsKt.set(model, "error", var9.getMessage());
         return "user/signup";
      }
   }
}
