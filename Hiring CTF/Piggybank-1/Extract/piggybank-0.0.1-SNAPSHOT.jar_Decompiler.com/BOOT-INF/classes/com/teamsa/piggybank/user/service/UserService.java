package com.teamsa.piggybank.user.service;

import com.teamsa.piggybank.user.UserConstants;
import com.teamsa.piggybank.user.domain.LoginLog;
import com.teamsa.piggybank.user.domain.User;
import com.teamsa.piggybank.user.repository.LoginLogRepository;
import com.teamsa.piggybank.user.repository.UserRepository;
import com.teamsa.piggybank.util.PasswordHashKt;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0016JL\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0017J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006$"},
   d2 = {"Lcom/teamsa/piggybank/user/service/UserService;", "", "userRepository", "Lcom/teamsa/piggybank/user/repository/UserRepository;", "loginLogRepository", "Lcom/teamsa/piggybank/user/repository/LoginLogRepository;", "(Lcom/teamsa/piggybank/user/repository/UserRepository;Lcom/teamsa/piggybank/user/repository/LoginLogRepository;)V", "checkRealnameAndRegnumber", "", "realName", "", "regNumber", "", "checkUserExist", "username", "checkUserLimitCount", "checkUserNonExist", "checkValidRegNumber", "createSecureCode", "uuid", "createUser", "Lkotlin/Pair;", "password", "email", "countryCode", "", "memo", "doLogin", "findUserById", "Lcom/teamsa/piggybank/user/domain/User;", "id", "findUserByUsername", "findUserByUsernameOrThrow", "saveLoginLog", "updateSecureCode", "secureCode", "piggybank"}
)
public class UserService {
   @NotNull
   private final UserRepository userRepository;
   @NotNull
   private final LoginLogRepository loginLogRepository;

   public UserService(@NotNull UserRepository userRepository, @NotNull LoginLogRepository loginLogRepository) {
      Intrinsics.checkNotNullParameter(userRepository, "userRepository");
      Intrinsics.checkNotNullParameter(loginLogRepository, "loginLogRepository");
      super();
      this.userRepository = userRepository;
      this.loginLogRepository = loginLogRepository;
   }

   @Transactional
   @NotNull
   public Pair<String, String> createUser(@NotNull String username, @NotNull String password, @NotNull String email, @NotNull String realName, long regNumber, int countryCode, @NotNull String memo) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(password, "password");
      Intrinsics.checkNotNullParameter(email, "email");
      Intrinsics.checkNotNullParameter(realName, "realName");
      Intrinsics.checkNotNullParameter(memo, "memo");
      if (!Intrinsics.areEqual(username, "") && !Intrinsics.areEqual(password, "") && !Intrinsics.areEqual(email, "") && !Intrinsics.areEqual(realName, "")) {
         if (username.length() >= 4 && username.length() <= 42) {
            if (password.length() >= 8 && password.length() <= 64) {
               if (username.equals(password)) {
                  throw new UserServiceException("유저명과 비밀번호를 동일하게 설정하지 마세요.");
               } else if (email.length() >= 10 && email.length() <= 60) {
                  if (realName.length() >= 2 && realName.length() <= 20) {
                     if (String.valueOf(regNumber).length() != 15) {
                        throw new UserServiceException("주민번호 길이를 확인해주세요.");
                     } else if (memo.length() >= 0 && memo.length() <= 70) {
                        this.checkUserLimitCount();
                        this.checkUserNonExist(username);
                        this.checkRealnameAndRegnumber(realName, regNumber);
                        this.checkValidRegNumber(regNumber);
                        String hashedPassword = PasswordHashKt.sha256(password);
                        Object var10000 = this.userRepository.save(new User(username, hashedPassword, email, realName, memo, regNumber, countryCode, (String)null, 128, (DefaultConstructorMarker)null));
                        Intrinsics.checkNotNullExpressionValue(var10000, "save(...)");
                        User newUser = (User)var10000;
                        String newSecureCode = this.createSecureCode(newUser.getId());
                        this.updateSecureCode(newUser.getId(), newSecureCode);
                        return new Pair(newSecureCode, newUser.getId());
                     } else {
                        throw new UserServiceException("메모 길이를 확인해주세요.");
                     }
                  } else {
                     throw new UserServiceException("실제이름 길이를 확인해주세요.");
                  }
               } else {
                  throw new UserServiceException("이메일 길이를 확인해주세요.");
               }
            } else {
               throw new UserServiceException("비밀번호 길이를 확인해주세요.");
            }
         } else {
            throw new UserServiceException("유저명 길이를 확인해 주세요.");
         }
      } else {
         throw new UserServiceException("값이 누락되었습니다.");
      }
   }

   @NotNull
   public String doLogin(@NotNull String username, @NotNull String password) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(password, "password");
      if (username.length() >= 4 && username.length() <= 42) {
         if (password.length() < 8) {
            throw new UserServiceException("비밀번호 길이를 확인해주세요.");
         } else {
            this.checkUserExist(username);
            String hashedPassword = PasswordHashKt.sha256(password);
            User user = this.findUserByUsername(username);
            if (!Intrinsics.areEqual(user.getPassword(), hashedPassword)) {
               throw new UserServiceException("올바르지 않은 비밀번호입니다.");
            } else {
               this.saveLoginLog(user.getUsername(), user.getId());
               return user.getId();
            }
         }
      } else {
         throw new UserServiceException("유저명 길이를 확인해주세요.");
      }
   }

   public void checkUserLimitCount() {
      long userCount = this.userRepository.count();
      if (userCount >= 50L) {
         throw new UserServiceException("더이상 계정을 생성할 수 없습니다.");
      }
   }

   public void checkUserExist(@NotNull String username) {
      Intrinsics.checkNotNullParameter(username, "username");
      if (!this.userRepository.existsByUsername(username)) {
         throw new UserServiceException("존재하지 않는 유저입니다.");
      }
   }

   public void checkUserNonExist(@NotNull String username) {
      Intrinsics.checkNotNullParameter(username, "username");
      if (this.userRepository.existsByUsername(username)) {
         throw new UserServiceException("이미 존재하는 유저입니다.");
      }
   }

   public void checkRealnameAndRegnumber(@NotNull String realName, long regNumber) {
      Intrinsics.checkNotNullParameter(realName, "realName");
      if (this.userRepository.existsByRealNameAndRegNumber(realName, regNumber)) {
         throw new UserServiceException("이미 가입한 유저입니다.");
      }
   }

   public void checkValidRegNumber(long regNumber) {
      try {
         String var10000 = String.valueOf(regNumber).substring(2, 4);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         int birthMonth = Integer.parseInt(var10000);
         var10000 = String.valueOf(regNumber).substring(4, 6);
         Intrinsics.checkNotNullExpressionValue(var10000, "substring(...)");
         int birthDay = Integer.parseInt(var10000);
         if (birthMonth >= 1 && birthMonth <= 12) {
            if (birthDay < 1 || birthDay > 31) {
               throw new UserServiceException("유효하지 않은 주민번호입니다.");
            }
         } else {
            throw new UserServiceException("유효하지 않은 주민번호입니다.");
         }
      } catch (UserServiceException var5) {
         throw new UserServiceException("유효하지 않은 주민번호입니다.");
      }
   }

   public void updateSecureCode(@NotNull String id, @NotNull String secureCode) {
      Intrinsics.checkNotNullParameter(id, "id");
      Intrinsics.checkNotNullParameter(secureCode, "secureCode");
      User user = this.findUserById(id);
      user.updateSecureCode(secureCode);
      this.userRepository.save(user);
   }

   @NotNull
   public String createSecureCode(@NotNull String uuid) {
      Intrinsics.checkNotNullParameter(uuid, "uuid");
      List shuffledList = CollectionsKt.shuffled((Iterable)UserConstants.INSTANCE.getSECURE_CODE_LIST());
      return CollectionsKt.joinToString$default((Iterable)shuffledList, (CharSequence)",", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
   }

   public void saveLoginLog(@NotNull String username, @NotNull String uuid) {
      Intrinsics.checkNotNullParameter(username, "username");
      Intrinsics.checkNotNullParameter(uuid, "uuid");
      this.loginLogRepository.save(new LoginLog(username, (LocalDateTime)null, uuid, 0, 10, (DefaultConstructorMarker)null));
   }

   @NotNull
   public User findUserById(@NotNull String id) {
      Intrinsics.checkNotNullParameter(id, "id");
      return this.userRepository.findUserById(id);
   }

   @NotNull
   public User findUserByUsername(@NotNull String username) {
      Intrinsics.checkNotNullParameter(username, "username");
      return this.userRepository.findUserByUsername(username);
   }

   @NotNull
   public User findUserByUsernameOrThrow(@NotNull String username) {
      Intrinsics.checkNotNullParameter(username, "username");
      return this.userRepository.findUserByUsername(username);
   }
}
