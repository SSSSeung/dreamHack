package com.teamsa.piggybank.user;

import com.teamsa.piggybank.cash.service.krw.KRWCashService;
import com.teamsa.piggybank.user.dto.UserLoginDto;
import com.teamsa.piggybank.user.service.UserService;
import com.teamsa.piggybank.user.service.UserServiceException;
import jakarta.servlet.http.HttpSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/user"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J4\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"},
   d2 = {"Lcom/teamsa/piggybank/user/UserSigninController;", "", "userService", "Lcom/teamsa/piggybank/user/service/UserService;", "krwcashService", "Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;", "(Lcom/teamsa/piggybank/user/service/UserService;Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;)V", "doSignIn", "", "authUser", "Ljakarta/servlet/http/HttpSession;", "data", "Lcom/teamsa/piggybank/user/dto/UserLoginDto;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "model", "Lorg/springframework/ui/Model;", "getLogin", "next", "error", "piggybank"}
)
@SourceDebugExtension({"SMAP\nUserSigninController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSigninController.kt\ncom/teamsa/piggybank/user/UserSigninController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public class UserSigninController {
   @NotNull
   private final UserService userService;
   @NotNull
   private final KRWCashService krwcashService;

   public UserSigninController(@NotNull UserService userService, @NotNull KRWCashService krwcashService) {
      Intrinsics.checkNotNullParameter(userService, "userService");
      Intrinsics.checkNotNullParameter(krwcashService, "krwcashService");
      super();
      this.userService = userService;
      this.krwcashService = krwcashService;
   }

   @GetMapping({"/signin"})
   @NotNull
   public String getLogin(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @RequestParam(value = "next",required = false,defaultValue = "") @NotNull String next, @RequestParam(value = "error",required = false,defaultValue = "") @NotNull String error, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(next, "next");
      Intrinsics.checkNotNullParameter(error, "error");
      Intrinsics.checkNotNullParameter(model, "model");
      if (!Intrinsics.areEqual(error, "")) {
         redirectAttrs.addFlashAttribute("error", error);
         return !Intrinsics.areEqual(next, "") ? "redirect:/user/signin?next=" + next : "redirect:/user/signin";
      } else {
         CharSequence var7 = (CharSequence)next;
         Object var10000;
         if (var7.length() == 0) {
            int var8 = false;
            var10000 = "/";
         } else {
            var10000 = var7;
         }

         String nextPath = (String)var10000;
         model.addAttribute("next", nextPath);
         return "user/signin";
      }
   }

   @PostMapping({"/signin"})
   @NotNull
   public String doSignIn(@NotNull HttpSession authUser, @ModelAttribute @NotNull UserLoginDto data, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(data, "data");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      String var10000 = data.getNext();
      if (var10000 == null) {
         var10000 = "/";
      }

      String nextPath = var10000;
      if (authUser.getAttribute("id") != null) {
         redirectAttrs.addFlashAttribute("error", "이미 로그인 되어 있습니다 \ud83d\udc3d");
         return "redirect:" + nextPath;
      } else {
         try {
            String user = this.userService.doLogin(data.getUsername(), data.getPassword());
            redirectAttrs.addFlashAttribute("alert", "로그인을 성공했습니다 \ud83d\udc17");
            authUser.setAttribute("id", user);
            authUser.setAttribute("username", data.getUsername());
            return "redirect:" + nextPath;
         } catch (UserServiceException var7) {
            ModelExtensionsKt.set(model, "error", var7.getMessage());
            return "user/signin";
         }
      }
   }
}
