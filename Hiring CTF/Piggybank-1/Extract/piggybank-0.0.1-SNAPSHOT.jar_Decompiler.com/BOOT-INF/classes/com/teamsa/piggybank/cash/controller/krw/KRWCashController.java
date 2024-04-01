package com.teamsa.piggybank.cash.controller.krw;

import com.teamsa.piggybank.cash.domain.Krwcash;
import com.teamsa.piggybank.cash.dto.CashTransferDto;
import com.teamsa.piggybank.cash.repository.krw.KRWCashRepository;
import com.teamsa.piggybank.cash.service.CashServiceException;
import com.teamsa.piggybank.cash.service.krw.KRWCashService;
import jakarta.servlet.http.HttpSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"/cash/krw"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J \u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J \u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"},
   d2 = {"Lcom/teamsa/piggybank/cash/controller/krw/KRWCashController;", "", "krwcashService", "Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;", "krwCashRepository", "Lcom/teamsa/piggybank/cash/repository/krw/KRWCashRepository;", "(Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;Lcom/teamsa/piggybank/cash/repository/krw/KRWCashRepository;)V", "getTransferCash", "", "authUser", "Ljakarta/servlet/http/HttpSession;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "model", "Lorg/springframework/ui/Model;", "postCreateBank", "transferKRW", "data", "Lcom/teamsa/piggybank/cash/dto/CashTransferDto;", "viewBalance", "piggybank"}
)
public class KRWCashController {
   @NotNull
   private final KRWCashService krwcashService;
   @NotNull
   private final KRWCashRepository krwCashRepository;

   public KRWCashController(@NotNull KRWCashService krwcashService, @NotNull KRWCashRepository krwCashRepository) {
      Intrinsics.checkNotNullParameter(krwcashService, "krwcashService");
      Intrinsics.checkNotNullParameter(krwCashRepository, "krwCashRepository");
      super();
      this.krwcashService = krwcashService;
      this.krwCashRepository = krwCashRepository;
   }

   @GetMapping({"/getBalance"})
   @NotNull
   public String viewBalance(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      String id = authUser.getAttribute("id").toString();
      if (!this.krwcashService.checkIdExist(id)) {
         redirectAttrs.addFlashAttribute("error", "KRW 계좌를 먼저 개설해주세요! \ud83d\udc37");
         return "redirect:/";
      } else {
         Krwcash var10000 = this.krwcashService.findKrwcashById(id);
         if (var10000 == null) {
            throw new CashServiceException("KRW 계좌 정보를 가져올 수 없습니다.");
         } else {
            Krwcash user = var10000;
            model.addAttribute("name", user.getRealName());
            model.addAttribute("balance", this.krwcashService.getBalance(user.getId()));
            Krwcash var10002 = this.krwCashRepository.findKrwcashById(id);
            model.addAttribute("accNumber", var10002 != null ? var10002.getAccNumber() : null);
            return "cash/krw/index";
         }
      }
   }

   @PostMapping({"/bank/create"})
   @NotNull
   public String postCreateBank(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");

      String id;
      try {
         id = authUser.getAttribute("id").toString();
         this.krwcashService.createBank(id);
         redirectAttrs.addFlashAttribute("alert", "KRW 계좌를 개설하였습니다! \ud83d\udc3d");
         id = "redirect:/cash/krw/getBalance";
      } catch (CashServiceException var6) {
         redirectAttrs.addFlashAttribute("error", var6.getMessage());
         id = "redirect:/cash/bank/create";
      }

      return id;
   }

   @GetMapping({"/transfer"})
   @NotNull
   public String getTransferCash(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      String id = authUser.getAttribute("id").toString();
      if (!this.krwcashService.checkIdExist(id)) {
         redirectAttrs.addFlashAttribute("error", "KRW 계좌를 먼저 개설해주세요! \ud83d\udc37");
         return "redirect:/";
      } else {
         return "cash/krw/transfer";
      }
   }

   @PostMapping({"/transfer"})
   @NotNull
   public String transferKRW(@NotNull HttpSession authUser, @ModelAttribute @NotNull CashTransferDto data, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(data, "data");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      String id = authUser.getAttribute("id").toString();
      if (!this.krwcashService.checkIdExist(id)) {
         redirectAttrs.addFlashAttribute("error", "KRW 계좌를 먼저 개설해주세요! \ud83d\udc37");
         return "redirect:/";
      } else {
         try {
            Krwcash user = this.krwcashService.findKrwcashById(id);
            Krwcash targetUser = this.krwcashService.getInfo(data.getAccNumber());
            if (user != null) {
               this.krwcashService.transferCash(user.getId(), targetUser, data.getAmount());
               redirectAttrs.addFlashAttribute("alert", "송금 성공!");
               return "redirect:/cash/krw/transfer";
            } else {
               redirectAttrs.addFlashAttribute("error", "송금 실패.. \ud83d\udc3d");
               return "redirect:/cash/krw/transfer";
            }
         } catch (CashServiceException var8) {
            redirectAttrs.addFlashAttribute("error", var8.getMessage());
            return "redirect:/cash/krw/transfer";
         }
      }
   }
}
