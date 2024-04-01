package com.teamsa.piggybank.user.controller;

import com.teamsa.piggybank.user.UserConstants;
import com.teamsa.piggybank.user.dto.UserChallengeDto;
import com.teamsa.piggybank.user.dto.UserResetPasswordDto;
import com.teamsa.piggybank.user.service.UserPasswordResetService;
import com.teamsa.piggybank.user.service.UserServiceException;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/user/reset"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0017J*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0017J*\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017J*\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0014H\u0017J*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u0006H\u0017J \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"},
   d2 = {"Lcom/teamsa/piggybank/user/controller/UserPasswordResetController;", "", "userPasswordResetService", "Lcom/teamsa/piggybank/user/service/UserPasswordResetService;", "(Lcom/teamsa/piggybank/user/service/UserPasswordResetService;)V", "challenge", "", "authUser", "Ljakarta/servlet/http/HttpSession;", "model", "Lorg/springframework/ui/Model;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "challengeToken", "changePassword", "passResetToken", "doChallenge", "data", "Lcom/teamsa/piggybank/user/dto/UserChallengeDto;", "doChangePassword", "Lcom/teamsa/piggybank/user/dto/UserResetPasswordDto;", "doFindUser", "username", "index", "piggybank"}
)
public class UserPasswordResetController {
   @NotNull
   private final UserPasswordResetService userPasswordResetService;

   public UserPasswordResetController(@NotNull UserPasswordResetService userPasswordResetService) {
      Intrinsics.checkNotNullParameter(userPasswordResetService, "userPasswordResetService");
      super();
      this.userPasswordResetService = userPasswordResetService;
   }

   @GetMapping({"/"})
   @NotNull
   public String index(@NotNull HttpSession authUser, @NotNull Model model, @NotNull RedirectAttributes redirectAttrs) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(model, "model");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      if (authUser.getAttribute("id") != null) {
         redirectAttrs.addFlashAttribute("error", "이미 로그인 되어 있습니다 \ud83d\udc3d");
         return "redirect:/";
      } else {
         return "user/reset/index";
      }
   }

   @PostMapping({"/"})
   @NotNull
   public String doFindUser(@NotNull HttpSession authUser, @NotNull Model model, @NotNull RedirectAttributes redirectAttrs, @ModelAttribute("username") @NotNull String username) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(model, "model");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(username, "username");
      if (authUser.getAttribute("id") != null) {
         redirectAttrs.addFlashAttribute("error", "이미 로그인 되어 있습니다 \ud83d\udc3d");
         return "redirect:/";
      } else {
         try {
            if (!this.userPasswordResetService.findUser(username)) {
               redirectAttrs.addFlashAttribute("error", "존재하지 않는 유저입니다.");
               return "redirect:/user/reset/";
            } else {
               String challengeToken = this.userPasswordResetService.createChallengeToken(username);
               return "redirect:/user/reset/challenge?challenge_token=" + challengeToken;
            }
         } catch (UserServiceException var7) {
            redirectAttrs.addFlashAttribute("error", var7.getMessage());
            return "redirect:/user/reset/";
         }
      }
   }

   @GetMapping({"/challenge"})
   @NotNull
   public String challenge(@NotNull HttpSession authUser, @NotNull Model model, @NotNull RedirectAttributes redirectAttrs, @RequestParam("challenge_token") @NotNull String challengeToken) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(model, "model");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      if (authUser.getAttribute("id") != null) {
         redirectAttrs.addFlashAttribute("error", "이미 로그인 되어 있습니다 \ud83d\udc3d");
         return "redirect:/";
      } else {
         try {
            List challengeIndex = UserPasswordResetService.createChallenge$default(this.userPasswordResetService, challengeToken, false, 2, (Object)null);
            model.addAttribute("challenge", challengeIndex);
            model.addAttribute("challenge_token", challengeToken);
            return "user/reset/challenge";
         } catch (UserServiceException var7) {
            redirectAttrs.addFlashAttribute("error", var7.getMessage());
            return "redirect:/user/reset/";
         }
      }
   }

   @PostMapping({"/challenge"})
   @NotNull
   public String doChallenge(@NotNull HttpSession authUser, @NotNull Model model, @NotNull RedirectAttributes redirectAttrs, @ModelAttribute @NotNull UserChallengeDto data) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(model, "model");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(data, "data");
      CharSequence var10000 = (CharSequence)data.getAnswers();
      String[] var6 = new String[]{","};
      List answers = CollectionsKt.toList((Iterable)StringsKt.split$default(var10000, var6, false, 0, 6, (Object)null));
      if (answers.size() != UserConstants.INSTANCE.getSECURE_CODE_INDEX()) {
         redirectAttrs.addFlashAttribute("error", UserConstants.INSTANCE.getSECURE_CODE_INDEX() + "개의 secure code를 입력해 주세요.");
         return "redirect:/user/reset/challenge?challenge_token=" + data.getChallengeToken();
      } else {
         String passResetToken;
         try {
            passResetToken = this.userPasswordResetService.doChallenge(data.getChallengeToken(), answers);
            passResetToken = "redirect:/user/reset/password?pass_reset_token=" + passResetToken;
         } catch (UserServiceException var8) {
            redirectAttrs.addFlashAttribute("error", var8.getMessage());
            passResetToken = "redirect:/user/reset/challenge?challenge_token=" + data.getChallengeToken();
         } catch (Exception var9) {
            redirectAttrs.addFlashAttribute("error", var9.getMessage());
            passResetToken = "redirect:/user/reset/";
         }

         return passResetToken;
      }
   }

   @GetMapping({"/password"})
   @NotNull
   public String changePassword(@NotNull HttpSession authUser, @NotNull Model model, @NotNull RedirectAttributes redirectAttrs, @RequestParam(value = "pass_reset_token",defaultValue = "") @NotNull String passResetToken) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(model, "model");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(passResetToken, "passResetToken");

      try {
         if (!this.userPasswordResetService.isExistPassResetToken(passResetToken)) {
            throw new UserServiceException("존재하지 않는 pass_reset_token 입니다.");
         } else {
            model.addAttribute("passwordToken", passResetToken);
            return "user/reset/password";
         }
      } catch (UserServiceException var6) {
         redirectAttrs.addFlashAttribute("error", var6.getMessage());
         return "redirect:/user/reset/";
      }
   }

   @PostMapping({"/password"})
   @NotNull
   public String doChangePassword(@NotNull HttpSession authUser, @NotNull Model model, @NotNull RedirectAttributes redirectAttrs, @ModelAttribute @NotNull UserResetPasswordDto data) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(model, "model");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(data, "data");

      try {
         this.userPasswordResetService.doChangePassword(data.getPassResetToken(), data.getFirstPassword(), data.getSecondPassword());
         redirectAttrs.addFlashAttribute("alert", "비밀번호가 변경되었습니다. \ud83d\udc17");
         return "redirect:/user/signin";
      } catch (UserServiceException var6) {
         redirectAttrs.addFlashAttribute("error", var6.getMessage());
         return "redirect:/user/reset/password?pass_reset_token=" + data.getPassResetToken();
      }
   }
}
