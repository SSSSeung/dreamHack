package com.teamsa.piggybank.cash;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"},
   d2 = {"Lcom/teamsa/piggybank/cash/CashConstants;", "", "()V", "AVAILABLE_CURRENCIES", "", "", "getAVAILABLE_CURRENCIES", "()Ljava/util/List;", "COMMISSION_RATE", "", "CURRENCY_KRW", "CURRENCY_USD", "KRW_PRICE", "", "TRANSFER_TYPE", "USD_PRICE", "piggybank"}
)
public final class CashConstants {
   @NotNull
   public static final CashConstants INSTANCE = new CashConstants();
   @NotNull
   public static final String TRANSFER_TYPE = "transfer";
   public static final int KRW_PRICE = 1320;
   public static final int USD_PRICE = 1;
   public static final double COMMISSION_RATE = 0.008D;
   @NotNull
   public static final String CURRENCY_KRW = "KRW";
   @NotNull
   public static final String CURRENCY_USD = "USD";
   @NotNull
   private static final List<String> AVAILABLE_CURRENCIES;

   private CashConstants() {
   }

   @NotNull
   public final List<String> getAVAILABLE_CURRENCIES() {
      return AVAILABLE_CURRENCIES;
   }

   static {
      String[] var0 = new String[]{"KRW", "USD"};
      AVAILABLE_CURRENCIES = CollectionsKt.listOf(var0);
   }
}
