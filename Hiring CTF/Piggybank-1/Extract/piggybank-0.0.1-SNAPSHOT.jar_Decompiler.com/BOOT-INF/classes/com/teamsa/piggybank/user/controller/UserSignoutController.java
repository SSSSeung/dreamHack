package com.teamsa.piggybank.user.controller;

import jakarta.servlet.http.HttpSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/user"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017¨\u0006\t"},
   d2 = {"Lcom/teamsa/piggybank/user/controller/UserSignoutController;", "", "()V", "doLogout", "", "authUser", "Ljakarta/servlet/http/HttpSession;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "piggybank"}
)
public class UserSignoutController {
   @RequestMapping({"/signout"})
   @NotNull
   public String doLogout(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      if (authUser.getAttribute("id") == null) {
         redirectAttrs.addFlashAttribute("error", "로그인을 먼저 해주세요 \ud83d\udc3d");
      } else {
         authUser.invalidate();
         redirectAttrs.addFlashAttribute("alert", "로그아웃을 성공했습니다 \ud83d\udc16");
      }

      return "redirect:/";
   }
}
