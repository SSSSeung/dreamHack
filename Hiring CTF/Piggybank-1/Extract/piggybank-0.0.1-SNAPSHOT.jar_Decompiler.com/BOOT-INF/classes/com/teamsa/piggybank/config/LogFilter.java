package com.teamsa.piggybank.config;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"},
   d2 = {"Lcom/teamsa/piggybank/config/LogFilter;", "Ljakarta/servlet/Filter;", "()V", "AUTH_URL_LIST", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "doFilter", "", "request", "Ljakarta/servlet/ServletRequest;", "response", "Ljakarta/servlet/ServletResponse;", "chain", "Ljakarta/servlet/FilterChain;", "piggybank"}
)
@SourceDebugExtension({"SMAP\nAuthFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthFilter.kt\ncom/teamsa/piggybank/config/LogFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1747#2,3:32\n*S KotlinDebug\n*F\n+ 1 AuthFilter.kt\ncom/teamsa/piggybank/config/LogFilter\n*L\n20#1:32,3\n*E\n"})
public final class LogFilter implements Filter {
   @NotNull
   private final ArrayList<String> AUTH_URL_LIST;

   public LogFilter() {
      String[] var1 = new String[]{"/cash", "/shop", "/user/mypage", "/api/user", "/api/cash"};
      this.AUTH_URL_LIST = CollectionsKt.arrayListOf(var1);
   }

   public void doFilter(@NotNull ServletRequest request, @Nullable ServletResponse response, @NotNull FilterChain chain) {
      Intrinsics.checkNotNullParameter(request, "request");
      Intrinsics.checkNotNullParameter(chain, "chain");
      HttpServletRequest httpServletRequest = (HttpServletRequest)request;
      Intrinsics.checkNotNull(response, "null cannot be cast to non-null type jakarta.servlet.http.HttpServletResponse");
      HttpServletResponse httpServletResponse = (HttpServletResponse)response;
      String requestURI = httpServletRequest.getRequestURI();
      HttpSession var10000 = httpServletRequest.getSession();
      Intrinsics.checkNotNullExpressionValue(var10000, "getSession(...)");
      HttpSession authUser = var10000;
      Iterable $this$any$iv = (Iterable)this.AUTH_URL_LIST;
      int $i$f$any = false;
      boolean var17;
      if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
         var17 = false;
      } else {
         Iterator var11 = $this$any$iv.iterator();

         while(true) {
            if (!var11.hasNext()) {
               var17 = false;
               break;
            }

            Object element$iv = var11.next();
            String it = (String)element$iv;
            int var14 = false;
            Intrinsics.checkNotNull(requestURI);
            if (StringsKt.startsWith$default(requestURI, it, false, 2, (Object)null)) {
               var17 = true;
               break;
            }
         }
      }

      boolean isUserLogin = var17;
      if (isUserLogin) {
         Object id = authUser.getAttribute("id");
         if (id == null) {
            String var18 = URLEncoder.encode("로그인이 필요합니다. 로그인을 해주세요! \ud83d\udc37", StandardCharsets.UTF_8.toString());
            Intrinsics.checkNotNullExpressionValue(var18, "encode(...)");
            String error = var18;
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/user/signin?error=" + error + "&next=" + requestURI);
            return;
         }
      }

      chain.doFilter(request, response);
   }
}
