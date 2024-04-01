package com.teamsa.piggybank.cash.controller;

import com.teamsa.piggybank.cash.dto.CashExchangeDto;
import com.teamsa.piggybank.cash.service.CashService;
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
@RequestMapping({"/cash"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J \u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"},
   d2 = {"Lcom/teamsa/piggybank/cash/controller/CashController;", "", "krwcashService", "Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;", "cashService", "Lcom/teamsa/piggybank/cash/service/CashService;", "(Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;Lcom/teamsa/piggybank/cash/service/CashService;)V", "getCreateBank", "", "authUser", "Ljakarta/servlet/http/HttpSession;", "redirectAttrs", "Lorg/springframework/web/servlet/mvc/support/RedirectAttributes;", "model", "Lorg/springframework/ui/Model;", "getExchangeUsdToKrw", "postExchange", "data", "Lcom/teamsa/piggybank/cash/dto/CashExchangeDto;", "piggybank"}
)
public class CashController {
   @NotNull
   private final KRWCashService krwcashService;
   @NotNull
   private final CashService cashService;

   public CashController(@NotNull KRWCashService krwcashService, @NotNull CashService cashService) {
      Intrinsics.checkNotNullParameter(krwcashService, "krwcashService");
      Intrinsics.checkNotNullParameter(cashService, "cashService");
      super();
      this.krwcashService = krwcashService;
      this.cashService = cashService;
   }

   @GetMapping({"/bank/create"})
   @NotNull
   public String getCreateBank(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      return "cash/bankCreate";
   }

   @GetMapping({"/exchange"})
   @NotNull
   public String getExchangeUsdToKrw(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(model, "model");
      return "cash/cashExchange";
   }

   @PostMapping({"/exchange"})
   @NotNull
   public String postExchange(@NotNull HttpSession authUser, @NotNull RedirectAttributes redirectAttrs, @ModelAttribute @NotNull CashExchangeDto data, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(redirectAttrs, "redirectAttrs");
      Intrinsics.checkNotNullParameter(data, "data");
      Intrinsics.checkNotNullParameter(model, "model");

      String id;
      try {
         id = authUser.getAttribute("id").toString();
         if (this.cashService.exchangeCash(id, data.getSrcCurrency(), data.getDstCurrency(), data.getAmount())) {
            redirectAttrs.addFlashAttribute("alert", "환전 성공! \ud83d\udc37\ud83d\udcb0");
         } else {
            redirectAttrs.addFlashAttribute("error", "환전 실패.. \ud83d\udc37\ud83d\udca7");
         }

         id = "cash/cashExchange";
      } catch (CashServiceException var7) {
         redirectAttrs.addFlashAttribute("error", var7.getMessage());
         id = "redirect:/cash/exchange";
      }

      return id;
   }
}
