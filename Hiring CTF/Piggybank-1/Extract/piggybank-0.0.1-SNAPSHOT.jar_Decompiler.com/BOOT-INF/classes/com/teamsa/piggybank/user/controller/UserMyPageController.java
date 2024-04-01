package com.teamsa.piggybank.user.controller;

import com.teamsa.piggybank.cash.service.krw.KRWCashService;
import com.teamsa.piggybank.user.service.UserService;
import jakarta.servlet.http.HttpSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/user"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"},
   d2 = {"Lcom/teamsa/piggybank/user/controller/UserMyPageController;", "", "userService", "Lcom/teamsa/piggybank/user/service/UserService;", "krwcashService", "Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;", "(Lcom/teamsa/piggybank/user/service/UserService;Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;)V", "getMypage", "", "authUser", "Ljakarta/servlet/http/HttpSession;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "model", "Lorg/springframework/ui/Model;", "piggybank"}
)
public class UserMyPageController {
   @NotNull
   private final UserService userService;
   @NotNull
   private final KRWCashService krwcashService;

   public UserMyPageController(@NotNull UserService userService, @NotNull KRWCashService krwcashService) {
      Intrinsics.checkNotNullParameter(userService, "userService");
      Intrinsics.checkNotNullParameter(krwcashService, "krwcashService");
      super();
      this.userService = userService;
      this.krwcashService = krwcashService;
   }

   @GetMapping({"/mypage"})
   @NotNull
   public String getMypage(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      return "user/mypage";
   }
}
