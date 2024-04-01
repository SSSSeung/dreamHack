package com.teamsa.piggybank.cash.api;

import com.teamsa.piggybank.cash.domain.CashExchangeLog;
import com.teamsa.piggybank.cash.dto.CashExchangeLogDto;
import com.teamsa.piggybank.cash.service.CashService;
import com.teamsa.piggybank.cash.service.CashServiceException;
import jakarta.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/cash/exchange"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\n"},
   d2 = {"Lcom/teamsa/piggybank/cash/api/CashApi;", "", "cashService", "Lcom/teamsa/piggybank/cash/service/CashService;", "(Lcom/teamsa/piggybank/cash/service/CashService;)V", "getExchangeLog", "", "Lcom/teamsa/piggybank/cash/dto/CashExchangeLogDto;", "authUser", "Ljakarta/servlet/http/HttpSession;", "piggybank"}
)
@SourceDebugExtension({"SMAP\nCashApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashApi.kt\ncom/teamsa/piggybank/cash/api/CashApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1549#2:56\n1620#2,3:57\n*S KotlinDebug\n*F\n+ 1 CashApi.kt\ncom/teamsa/piggybank/cash/api/CashApi\n*L\n29#1:56\n29#1:57,3\n*E\n"})
public class CashApi {
   @NotNull
   private final CashService cashService;

   public CashApi(@NotNull CashService cashService) {
      Intrinsics.checkNotNullParameter(cashService, "cashService");
      super();
      this.cashService = cashService;
   }

   @PostMapping({"/log"})
   @NotNull
   public List<CashExchangeLogDto> getExchangeLog(@NotNull HttpSession authUser) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");

      try {
         String currentId = authUser.getAttribute("id").toString();
         List exchangeLog = this.cashService.findCashExchangeLogBySubjectId(currentId);
         Iterable $this$map$iv = (Iterable)exchangeLog;
         int $i$f$map = false;
         Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
         int $i$f$mapTo = false;
         Iterator var10 = $this$map$iv.iterator();

         while(var10.hasNext()) {
            Object item$iv$iv = var10.next();
            CashExchangeLog it = (CashExchangeLog)item$iv$iv;
            int var13 = false;
            destination$iv$iv.add(new CashExchangeLogDto(it.getSrc(), it.getDst(), it.getSrcPrice(), it.getDstPrice(), it.getAmount(), it.getSubjectId(), it.getExchangeDate()));
         }

         List logDtoList = (List)destination$iv$iv;
         return logDtoList;
      } catch (CashServiceException var15) {
         BigDecimal var10004 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10004, "ZERO");
         BigDecimal var10005 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10005, "ZERO");
         BigDecimal var10006 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10006, "ZERO");
         LocalDateTime var10008 = LocalDateTime.MIN;
         Intrinsics.checkNotNullExpressionValue(var10008, "MIN");
         return CollectionsKt.listOf(new CashExchangeLogDto("", "", var10004, var10005, var10006, "", var10008));
      }
   }
}
