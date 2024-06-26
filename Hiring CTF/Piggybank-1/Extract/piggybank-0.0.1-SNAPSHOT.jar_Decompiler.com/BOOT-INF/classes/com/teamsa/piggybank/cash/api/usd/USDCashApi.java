package com.teamsa.piggybank.cash.api.usd;

import com.teamsa.piggybank.cash.domain.UsdcashLog;
import com.teamsa.piggybank.cash.dto.CashLogDto;
import com.teamsa.piggybank.cash.service.CashServiceException;
import com.teamsa.piggybank.cash.service.usd.USDCashService;
import jakarta.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/cash/usd"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\r"},
   d2 = {"Lcom/teamsa/piggybank/cash/api/usd/USDCashApi;", "", "usdcashService", "Lcom/teamsa/piggybank/cash/service/usd/USDCashService;", "(Lcom/teamsa/piggybank/cash/service/usd/USDCashService;)V", "getUsdLog", "", "Lcom/teamsa/piggybank/cash/dto/CashLogDto;", "authUser", "Ljakarta/servlet/http/HttpSession;", "category", "", "category2", "piggybank"}
)
@SourceDebugExtension({"SMAP\nUSDCashApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USDCashApi.kt\ncom/teamsa/piggybank/cash/api/usd/USDCashApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1549#2:66\n1620#2,3:67\n1549#2:70\n1620#2,3:71\n*S KotlinDebug\n*F\n+ 1 USDCashApi.kt\ncom/teamsa/piggybank/cash/api/usd/USDCashApi\n*L\n29#1:66\n29#1:67,3\n41#1:70\n41#1:71,3\n*E\n"})
public class USDCashApi {
   @NotNull
   private final USDCashService usdcashService;

   public USDCashApi(@NotNull USDCashService usdcashService) {
      Intrinsics.checkNotNullParameter(usdcashService, "usdcashService");
      super();
      this.usdcashService = usdcashService;
   }

   @PostMapping({"/log"})
   @NotNull
   public List<CashLogDto> getUsdLog(@NotNull HttpSession authUser, @RequestParam("category") @NotNull String category, @RequestParam("category2") @NotNull String category2) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(category, "category");
      Intrinsics.checkNotNullParameter(category2, "category2");

      try {
         String currentId = authUser.getAttribute("id").toString();
         List senderLog = this.usdcashService.findUsdcashLogBySenderIdAndCategory(currentId, category);
         List receiverLog = this.usdcashService.findUsdcashLogByReceiverIdAndCategory(currentId, category);
         List logDtoList;
         Iterable $this$map$iv;
         boolean $i$f$map;
         Collection destination$iv$iv;
         boolean $i$f$mapTo;
         Iterator var13;
         Object item$iv$iv;
         UsdcashLog it;
         boolean var16;
         if (Intrinsics.areEqual(category2, "sender")) {
            $this$map$iv = (Iterable)senderLog;
            $i$f$map = false;
            destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
            $i$f$mapTo = false;
            var13 = $this$map$iv.iterator();

            while(var13.hasNext()) {
               item$iv$iv = var13.next();
               it = (UsdcashLog)item$iv$iv;
               var16 = false;
               destination$iv$iv.add(new CashLogDto(it.getAmount(), it.getCategory(), it.getReceiverAccNumber(), it.getReceiverId(), it.getSenderAccNumber(), it.getSenderId()));
            }

            logDtoList = (List)destination$iv$iv;
            return logDtoList;
         } else {
            $this$map$iv = (Iterable)receiverLog;
            $i$f$map = false;
            destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
            $i$f$mapTo = false;
            var13 = $this$map$iv.iterator();

            while(var13.hasNext()) {
               item$iv$iv = var13.next();
               it = (UsdcashLog)item$iv$iv;
               var16 = false;
               destination$iv$iv.add(new CashLogDto(it.getAmount(), it.getCategory(), it.getReceiverAccNumber(), it.getReceiverId(), it.getSenderAccNumber(), it.getSenderId()));
            }

            logDtoList = (List)destination$iv$iv;
            return logDtoList;
         }
      } catch (CashServiceException var18) {
         BigDecimal var10002 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10002, "ZERO");
         return CollectionsKt.listOf(new CashLogDto(var10002, "", "", "", "", ""));
      }
   }
}
