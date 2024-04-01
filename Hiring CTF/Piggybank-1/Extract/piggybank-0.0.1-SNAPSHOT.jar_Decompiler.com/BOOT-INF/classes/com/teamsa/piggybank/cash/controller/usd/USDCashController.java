package com.teamsa.piggybank.cash.controller.usd;

import com.teamsa.piggybank.cash.domain.Usdcash;
import com.teamsa.piggybank.cash.dto.CashTransferDto;
import com.teamsa.piggybank.cash.repository.usd.USDCashRepository;
import com.teamsa.piggybank.cash.service.CashServiceException;
import com.teamsa.piggybank.cash.service.usd.USDCashService;
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
@RequestMapping({"/cash/usd"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J \u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J \u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"},
   d2 = {"Lcom/teamsa/piggybank/cash/controller/usd/USDCashController;", "", "usdCashService", "Lcom/teamsa/piggybank/cash/service/usd/USDCashService;", "usdCashRepository", "Lcom/teamsa/piggybank/cash/repository/usd/USDCashRepository;", "(Lcom/teamsa/piggybank/cash/service/usd/USDCashService;Lcom/teamsa/piggybank/cash/repository/usd/USDCashRepository;)V", "getTransferCash", "", "authUser", "Ljakarta/servlet/http/HttpSession;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "model", "Lorg/springframework/ui/Model;", "postCreateBank", "transferUSD", "data", "Lcom/teamsa/piggybank/cash/dto/CashTransferDto;", "viewBalance", "piggybank"}
)
public class USDCashController {
   @NotNull
   private final USDCashService usdCashService;
   @NotNull
   private final USDCashRepository usdCashRepository;

   public USDCashController(@NotNull USDCashService usdCashService, @NotNull USDCashRepository usdCashRepository) {
      Intrinsics.checkNotNullParameter(usdCashService, "usdCashService");
      Intrinsics.checkNotNullParameter(usdCashRepository, "usdCashRepository");
      super();
      this.usdCashService = usdCashService;
      this.usdCashRepository = usdCashRepository;
   }

   @GetMapping({"/getBalance"})
   @NotNull
   public String viewBalance(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      String id = authUser.getAttribute("id").toString();
      if (!this.usdCashService.checkIdExist(id)) {
         redirectAttrs.addFlashAttribute("error", "USD 계좌를 먼저 개설해주세요! \ud83d\udc37");
         return "redirect:/";
      } else {
         Usdcash var10000 = this.usdCashService.findUsdcashById(id);
         if (var10000 == null) {
            throw new CashServiceException("USD 계좌 정보를 가져올 수 없습니다.");
         } else {
            Usdcash user = var10000;
            model.addAttribute("name", user.getRealName());
            model.addAttribute("balance", this.usdCashService.getBalance(user.getId()));
            Usdcash var10002 = this.usdCashRepository.findUsdcashById(id);
            model.addAttribute("accNumber", var10002 != null ? var10002.getAccNumber() : null);
            return "cash/usd/index";
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
         this.usdCashService.createBank(id);
         redirectAttrs.addFlashAttribute("alert", "USD 계좌를 개설하였습니다! \ud83d\udc3d");
         id = "redirect:/cash/usd/getBalance";
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
      if (!this.usdCashService.checkIdExist(id)) {
         redirectAttrs.addFlashAttribute("error", "USD 계좌를 먼저 개설해주세요! \ud83d\udc37");
         return "redirect:/";
      } else {
         return "cash/usd/transfer";
      }
   }

   @PostMapping({"/transfer"})
   @NotNull
   public String transferUSD(@NotNull HttpSession authUser, @ModelAttribute @NotNull CashTransferDto data, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(data, "data");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      String id = authUser.getAttribute("id").toString();
      if (!this.usdCashService.checkIdExist(id)) {
         redirectAttrs.addFlashAttribute("error", "USD 계좌를 먼저 개설해주세요! \ud83d\udc37");
         return "redirect:/";
      } else {
         String var6;
         try {
            Usdcash var10000 = this.usdCashService.findUsdcashById(id);
            if (var10000 == null) {
               throw new CashServiceException("USD 계좌 정보를 가져올 수 없습니다.");
            }

            Usdcash user = var10000;
            Usdcash targetUser = this.usdCashService.getInfo(data.getAccNumber());
            this.usdCashService.transferCash(user.getId(), targetUser, data.getAmount());
            redirectAttrs.addFlashAttribute("alert", "송금 성공!");
            var6 = "redirect:/cash/usd/transfer";
         } catch (CashServiceException var8) {
            redirectAttrs.addFlashAttribute("error", var8.getMessage());
            var6 = "redirect:/cash/usd/transfer";
         }

         return var6;
      }
   }
}
