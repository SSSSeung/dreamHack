package com.teamsa.piggybank.user.api;

import com.teamsa.piggybank.cash.domain.Krwcash;
import com.teamsa.piggybank.cash.dto.CashInfoDto;
import com.teamsa.piggybank.cash.service.CashServiceException;
import com.teamsa.piggybank.cash.service.krw.KRWCashService;
import com.teamsa.piggybank.user.domain.User;
import com.teamsa.piggybank.user.dto.UserDto;
import com.teamsa.piggybank.user.service.UserService;
import com.teamsa.piggybank.user.service.UserServiceException;
import jakarta.servlet.http.HttpSession;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/user"})
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"},
   d2 = {"Lcom/teamsa/piggybank/user/api/UserApi;", "", "userService", "Lcom/teamsa/piggybank/user/service/UserService;", "krwcashService", "Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;", "(Lcom/teamsa/piggybank/user/service/UserService;Lcom/teamsa/piggybank/cash/service/krw/KRWCashService;)V", "getKrwcash", "Lcom/teamsa/piggybank/cash/dto/CashInfoDto;", "authUser", "Ljakarta/servlet/http/HttpSession;", "id", "", "model", "Lorg/springframework/ui/Model;", "getMyinfo", "Lcom/teamsa/piggybank/user/dto/UserDto;", "piggybank"}
)
public class UserApi {
   @NotNull
   private final UserService userService;
   @NotNull
   private final KRWCashService krwcashService;

   public UserApi(@NotNull UserService userService, @NotNull KRWCashService krwcashService) {
      Intrinsics.checkNotNullParameter(userService, "userService");
      Intrinsics.checkNotNullParameter(krwcashService, "krwcashService");
      super();
      this.userService = userService;
      this.krwcashService = krwcashService;
   }

   @PostMapping({"/mypage"})
   @NotNull
   public UserDto getMyinfo(@NotNull HttpSession authUser, @ModelAttribute("id") @NotNull String id, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(id, "id");
      Intrinsics.checkNotNullParameter(model, "model");

      try {
         String currentId = authUser.getAttribute("id").toString();
         User user = this.userService.findUserById(currentId);
         String var6 = user.getUsername();
         String var7 = user.getId();
         String var8 = user.getEmail();
         String var9 = user.getRealName();
         int var10 = user.getCountryCode();
         String var11 = user.getMemo();
         return new UserDto(var6, var8, var7, var9, var10, var11);
      } catch (UserServiceException var12) {
         return new UserDto("", "", "", "", 0, "");
      }
   }

   @PostMapping({"/mypage/krwcash"})
   @NotNull
   public CashInfoDto getKrwcash(@NotNull HttpSession authUser, @ModelAttribute("id") @NotNull String id, @NotNull Model model) {
      Intrinsics.checkNotNullParameter(authUser, "authUser");
      Intrinsics.checkNotNullParameter(id, "id");
      Intrinsics.checkNotNullParameter(model, "model");

      BigDecimal var10003;
      try {
         String currentId = authUser.getAttribute("id").toString();
         Krwcash info = this.krwcashService.findKrwcashById(currentId);
         if (info != null) {
            return new CashInfoDto(info.getAccNumber(), info.getBalance());
         } else {
            var10003 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(var10003, "ZERO");
            return new CashInfoDto("", var10003);
         }
      } catch (CashServiceException var6) {
         var10003 = BigDecimal.ZERO;
         Intrinsics.checkNotNullExpressionValue(var10003, "ZERO");
         return new CashInfoDto("", var10003);
      }
   }
}
