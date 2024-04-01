package com.teamsa.piggybank.util;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 9, 0},
   k = 2,
   xi = 48,
   d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0005"},
   d2 = {"hashString", "", "input", "algorithm", "sha256", "piggybank"}
)
@SourceDebugExtension({"SMAP\nPasswordHash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasswordHash.kt\ncom/teamsa/piggybank/util/PasswordHashKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,14:1\n12734#2,3:15\n*S KotlinDebug\n*F\n+ 1 PasswordHash.kt\ncom/teamsa/piggybank/util/PasswordHashKt\n*L\n13#1:15,3\n*E\n"})
public final class PasswordHashKt {
   @NotNull
   public static final String sha256(@NotNull String $this$sha256) {
      Intrinsics.checkNotNullParameter($this$sha256, "<this>");
      return hashString($this$sha256, "SHA-256");
   }

   private static final String hashString(String input, String algorithm) {
      MessageDigest var10000 = MessageDigest.getInstance(algorithm);
      byte[] var10001 = input.getBytes(Charsets.UTF_8);
      Intrinsics.checkNotNullExpressionValue(var10001, "getBytes(...)");
      byte[] var14 = var10000.digest(var10001);
      Intrinsics.checkNotNullExpressionValue(var14, "digest(...)");
      byte[] $this$fold$iv = var14;
      Object initial$iv = "";
      int $i$f$fold = false;
      Object accumulator$iv = initial$iv;
      int var6 = 0;

      for(int var7 = $this$fold$iv.length; var6 < var7; ++var6) {
         byte element$iv = $this$fold$iv[var6];
         int var11 = false;
         String var12 = "%02x";
         Object[] var13 = new Object[]{element$iv};
         String var15 = String.format(var12, Arrays.copyOf(var13, var13.length));
         Intrinsics.checkNotNullExpressionValue(var15, "format(...)");
         accumulator$iv = accumulator$iv + var15;
      }

      return accumulator$iv;
   }
}
