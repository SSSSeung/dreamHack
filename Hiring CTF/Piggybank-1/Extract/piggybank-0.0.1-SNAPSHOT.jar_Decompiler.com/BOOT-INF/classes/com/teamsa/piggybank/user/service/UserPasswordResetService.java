package com.teamsa.piggybank.user.service;

import com.teamsa.piggybank.user.UserConstants;
import com.teamsa.piggybank.user.domain.User;
import com.teamsa.piggybank.user.repository.UserRepository;
import com.teamsa.piggybank.util.PasswordHashKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0016J \u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0'2\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020!H\u0016J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0016J\u001e\u0010+\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060'H\u0016J \u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0016J\u0010\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\u0006H\u0016J\u0010\u00103\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u00105\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u00106\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u00108\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001aH\u0016J\u0010\u0010:\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u001e\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00010\u00010\u001eX\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006;"},
   d2 = {"Lcom/teamsa/piggybank/user/service/UserPasswordResetService;", "", "userRepository", "Lcom/teamsa/piggybank/user/repository/UserRepository;", "redisTemplate", "Lorg/springframework/data/redis/core/RedisTemplate;", "", "userService", "Lcom/teamsa/piggybank/user/service/UserService;", "(Lcom/teamsa/piggybank/user/repository/UserRepository;Lorg/springframework/data/redis/core/RedisTemplate;Lcom/teamsa/piggybank/user/service/UserService;)V", "CHALLENGE_INDEX_PREFIX", "getCHALLENGE_INDEX_PREFIX", "()Ljava/lang/String;", "CHALLENGE_TOKEN_PREFIX", "getCHALLENGE_TOKEN_PREFIX", "CONFIG_PREFIX", "getCONFIG_PREFIX", "KEY_EXPIRATION_TIME", "", "getKEY_EXPIRATION_TIME", "()J", "LOCK_PREFIX", "getLOCK_PREFIX", "PASS_TOKEN_PREFIX", "getPASS_TOKEN_PREFIX", "RATE_LIMIT", "", "getRATE_LIMIT", "()I", "redis", "Lorg/springframework/data/redis/core/ValueOperations;", "kotlin.jvm.PlatformType", "canLock", "", "challengeToken", "checkRateLimit", "", "count", "createChallenge", "", "mode", "createChallengeToken", "username", "doChallenge", "answer", "doChangePassword", "passResetToken", "firstPassword", "secondPassword", "findUser", "userName", "getRateLimit", "getUserId", "getUsername", "isExistChallengeToken", "isExistPassResetToken", "setRateLimit", "rateLimitCount", "setUnLock", "piggybank"}
)
@SourceDebugExtension({"SMAP\nUserPasswordResetService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPasswordResetService.kt\ncom/teamsa/piggybank/user/service/UserPasswordResetService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n1549#2:199\n1620#2,3:200\n1549#2:203\n1620#2,3:204\n*S KotlinDebug\n*F\n+ 1 UserPasswordResetService.kt\ncom/teamsa/piggybank/user/service/UserPasswordResetService\n*L\n52#1:199\n52#1:200,3\n80#1:203\n80#1:204,3\n*E\n"})
public class UserPasswordResetService {
   @NotNull
   private final UserRepository userRepository;
   @NotNull
   private final RedisTemplate<String, Object> redisTemplate;
   @NotNull
   private final UserService userService;
   @NotNull
   private final ValueOperations<String, Object> redis;
   @NotNull
   private final String CONFIG_PREFIX;
   @NotNull
   private final String LOCK_PREFIX;
   @NotNull
   private final String CHALLENGE_TOKEN_PREFIX;
   @NotNull
   private final String CHALLENGE_INDEX_PREFIX;
   @NotNull
   private final String PASS_TOKEN_PREFIX;
   private final long KEY_EXPIRATION_TIME;
   private final int RATE_LIMIT;

   public UserPasswordResetService(@NotNull UserRepository userRepository, @NotNull RedisTemplate<String, Object> redisTemplate, @NotNull UserService userService) {
      Intrinsics.checkNotNullParameter(userRepository, "userRepository");
      Intrinsics.checkNotNullParameter(redisTemplate, "redisTemplate");
      Intrinsics.checkNotNullParameter(userService, "userService");
      super();
      this.userRepository = userRepository;
      this.redisTemplate = redisTemplate;
      this.userService = userService;
      ValueOperations var10001 = this.redisTemplate.opsForValue();
      Intrinsics.checkNotNullExpressionValue(var10001, "opsForValue(...)");
      this.redis = var10001;
      this.CONFIG_PREFIX = "CONFIG";
      this.LOCK_PREFIX = "LOCK";
      this.CHALLENGE_TOKEN_PREFIX = "CHALLENGE:TOKEN";
      this.CHALLENGE_INDEX_PREFIX = "CHALLENGE:INDEX";
      this.PASS_TOKEN_PREFIX = "PASS:TOKEN";
      this.KEY_EXPIRATION_TIME = 30L;
      this.RATE_LIMIT = 8;
   }

   @NotNull
   public String getCONFIG_PREFIX() {
      return this.CONFIG_PREFIX;
   }

   @NotNull
   public String getLOCK_PREFIX() {
      return this.LOCK_PREFIX;
   }

   @NotNull
   public String getCHALLENGE_TOKEN_PREFIX() {
      return this.CHALLENGE_TOKEN_PREFIX;
   }

   @NotNull
   public String getCHALLENGE_INDEX_PREFIX() {
      return this.CHALLENGE_INDEX_PREFIX;
   }

   @NotNull
   public String getPASS_TOKEN_PREFIX() {
      return this.PASS_TOKEN_PREFIX;
   }

   public long getKEY_EXPIRATION_TIME() {
      return this.KEY_EXPIRATION_TIME;
   }

   public int getRATE_LIMIT() {
      return this.RATE_LIMIT;
   }

   @NotNull
   public String createChallengeToken(@NotNull String username) {
      Intrinsics.checkNotNullParameter(username, "username");
      String var10000 = UUID.randomUUID().toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      String challengeToken = var10000;
      var10000 = this.getCHALLENGE_TOKEN_PREFIX();
      String challengeKey = var10000 + ":" + challengeToken;
      this.redis.set(challengeKey, username);
      this.redisTemplate.expire(challengeKey, this.getKEY_EXPIRATION_TIME(), TimeUnit.MINUTES);
      return challengeToken;
   }

   @NotNull
   public List<Integer> createChallenge(@NotNull String challengeToken, boolean mode) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      if (!Intrinsics.areEqual(challengeToken, "") && this.isExistChallengeToken(challengeToken)) {
         String var10000 = this.getCHALLENGE_INDEX_PREFIX();
         String key = var10000 + ":" + challengeToken;
         Object prevChallenge = this.redis.get(key);
         if (mode && prevChallenge != null) {
            CharSequence var18 = (CharSequence)prevChallenge.toString();
            String[] var15 = new String[]{","};
            Iterable $this$map$iv = (Iterable)StringsKt.split$default(var18, var15, false, 0, 6, (Object)null);
            int $i$f$map = false;
            Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
            int $i$f$mapTo = false;
            Iterator var10 = $this$map$iv.iterator();

            while(var10.hasNext()) {
               Object item$iv$iv = var10.next();
               String it = (String)item$iv$iv;
               int var13 = false;
               destination$iv$iv.add(Integer.parseInt(it));
            }

            return (List)destination$iv$iv;
         } else {
            List randomIndex = CollectionsKt.emptyList();

            do {
               randomIndex = CollectionsKt.sorted((Iterable)CollectionsKt.toList((Iterable)SequencesKt.toSet(SequencesKt.take(SequencesKt.distinct(SequencesKt.generateSequence((Function0)null.INSTANCE)), UserConstants.INSTANCE.getSECURE_CODE_INDEX()))));
            } while(randomIndex.size() != UserConstants.INSTANCE.getSECURE_CODE_INDEX());

            String value = CollectionsKt.joinToString$default((Iterable)randomIndex, (CharSequence)",", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
            this.redis.set(key, value);
            this.redisTemplate.expire(key, this.getKEY_EXPIRATION_TIME(), TimeUnit.MINUTES);
            return randomIndex;
         }
      } else {
         throw new UserServiceException("올바르지 않은 challenge token 값입니다.");
      }
   }

   // $FF: synthetic method
   public static List createChallenge$default(UserPasswordResetService var0, String var1, boolean var2, int var3, Object var4) {
      if (var4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createChallenge");
      } else {
         if ((var3 & 2) != 0) {
            var2 = true;
         }

         return var0.createChallenge(var1, var2);
      }
   }

   @NotNull
   public String doChallenge(@NotNull String challengeToken, @NotNull List<String> answer) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      Intrinsics.checkNotNullParameter(answer, "answer");
      String passResetToken = "";
      if (!Intrinsics.areEqual(challengeToken, "") && this.isExistChallengeToken(challengeToken)) {
         try {
            if (this.canLock(challengeToken)) {
               ValueOperations var10000 = this.redis;
               String var10001 = this.getCHALLENGE_INDEX_PREFIX();
               Object var26 = var10000.get(var10001 + ":" + challengeToken);
               if (var26 != null) {
                  String var27 = var26.toString();
                  if (var27 != null) {
                     CharSequence var28 = (CharSequence)var27;
                     String[] var8 = new String[]{","};
                     List var29 = StringsKt.split$default(var28, var8, false, 0, 6, (Object)null);
                     if (var29 != null) {
                        Iterable $this$map$iv = (Iterable)var29;
                        int $i$f$map = false;
                        Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
                        int $i$f$mapTo = false;
                        Iterator var14 = $this$map$iv.iterator();

                        while(var14.hasNext()) {
                           Object item$iv$iv = var14.next();
                           String it = (String)item$iv$iv;
                           int var17 = false;
                           destination$iv$iv.add(Integer.parseInt(it));
                        }

                        List challengeIndex = (List)destination$iv$iv;
                        var10000 = this.redis;
                        var10001 = this.getCHALLENGE_TOKEN_PREFIX();
                        var26 = var10000.get(var10001 + ":" + challengeToken);
                        if (var26 != null) {
                           var27 = var26.toString();
                           if (var27 != null) {
                              String userName = var27;
                              User var30 = this.userRepository.findUserByUsername(userName);
                              if (var30 == null) {
                                 throw new UserServiceException("예상치 못한 에러가 발생 했습니다.");
                              }

                              User userInfo = var30;
                              var28 = (CharSequence)userInfo.getSecureCode();
                              var8 = new String[]{","};
                              List userSecureCode = StringsKt.split$default(var28, var8, false, 0, 6, (Object)null);
                              int rateLimitCount = this.getRateLimit(challengeToken);
                              Thread.sleep(8000L);
                              this.checkRateLimit(rateLimitCount);
                              Iterator var22 = challengeIndex.iterator();
                              int var24 = 0;

                              while(var22.hasNext()) {
                                 int index = var24++;
                                 int challIndex = ((Number)var22.next()).intValue();
                                 if (!Intrinsics.areEqual(userSecureCode.get(challIndex - 1), answer.get(index))) {
                                    this.setRateLimit(challengeToken, rateLimitCount + 1);
                                    throw new UserServiceException("올바르지 않은 secure code 입니다. 실패 횟수: " + (rateLimitCount + 1));
                                 }
                              }

                              var27 = UUID.randomUUID().toString();
                              Intrinsics.checkNotNullExpressionValue(var27, "toString(...)");
                              passResetToken = var27;
                              var27 = this.getPASS_TOKEN_PREFIX();
                              String passKey = var27 + ":" + passResetToken;
                              this.setUnLock(challengeToken);
                              this.redis.set(passKey, userName);
                              this.redisTemplate.expire(passKey, this.getKEY_EXPIRATION_TIME(), TimeUnit.MINUTES);
                              RedisTemplate var31 = this.redisTemplate;
                              var10001 = this.getCHALLENGE_TOKEN_PREFIX();
                              var31.delete(var10001 + ":" + challengeToken);
                              var31 = this.redisTemplate;
                              var10001 = this.getCHALLENGE_INDEX_PREFIX();
                              var31.delete(var10001 + ":" + challengeToken);
                              return passResetToken;
                           }
                        }

                        throw new UserServiceException("challenge token이 만료되었습니다.");
                     }
                  }
               }

               throw new UserServiceException("challenge 코드가 만료되었습니다.");
            } else {
               return passResetToken;
            }
         } catch (UserServiceException var19) {
            this.setUnLock(challengeToken);
            throw new UserServiceException(String.valueOf(var19.getMessage()));
         } catch (Exception var20) {
            this.setUnLock(challengeToken);
            throw new UserServiceException("알 수 없는 에러 입니다.");
         }
      } else {
         throw new UserServiceException("올바르지 않은 challenge token 값 입니다.");
      }
   }

   public boolean findUser(@NotNull String userName) {
      Intrinsics.checkNotNullParameter(userName, "userName");
      return this.userRepository.existsByUsername(userName);
   }

   public boolean isExistChallengeToken(@NotNull String challengeToken) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      ValueOperations var10000 = this.redis;
      String var10001 = this.getCHALLENGE_TOKEN_PREFIX();
      return var10000.get(var10001 + ":" + challengeToken) != null;
   }

   public boolean isExistPassResetToken(@NotNull String passResetToken) {
      Intrinsics.checkNotNullParameter(passResetToken, "passResetToken");
      ValueOperations var10000 = this.redis;
      String var10001 = this.getPASS_TOKEN_PREFIX();
      return var10000.get(var10001 + ":" + passResetToken) != null;
   }

   public void checkRateLimit(int count) {
      if (count >= this.getRATE_LIMIT()) {
         throw new UserServiceException("더이상 패스워드를 초기화 할 수 없습니다. 관라자에게 문의해 주세요.");
      }
   }

   public int getRateLimit(@NotNull String challengeToken) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      String userName = this.getUsername(challengeToken);
      String var10000 = this.getCONFIG_PREFIX();
      String rateLimitKey = var10000 + ":" + userName;
      Object var4 = this.redis.get(rateLimitKey);
      int var5;
      if (var4 != null) {
         var10000 = var4.toString();
         if (var10000 != null) {
            var5 = Integer.parseInt(var10000);
            return var5;
         }
      }

      var5 = 0;
      return var5;
   }

   public void setRateLimit(@NotNull String challengeToken, int rateLimitCount) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      String userName = this.getUsername(challengeToken);
      String var10000 = this.getCONFIG_PREFIX();
      String rateLimitKey = var10000 + ":" + userName;
      this.redis.set(rateLimitKey, String.valueOf(rateLimitCount));
   }

   @NotNull
   public String getUsername(@NotNull String challengeToken) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      ValueOperations var10000 = this.redis;
      String var10001 = this.getCHALLENGE_TOKEN_PREFIX();
      return String.valueOf(var10000.get(var10001 + ":" + challengeToken));
   }

   @NotNull
   public String getUserId(@NotNull String challengeToken) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      String userName = this.getUsername(challengeToken);
      User var10000 = this.userRepository.findUserByUsername(userName);
      if (var10000 == null) {
         throw new UserServiceException("존재하지 않는 유저 입니다.");
      } else {
         User user = var10000;
         return user.getId();
      }
   }

   public boolean canLock(@NotNull String challengeToken) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      String userId = this.getUserId(challengeToken);
      String var10000 = this.getCONFIG_PREFIX();
      String lockKey = var10000 + ":" + this.getLOCK_PREFIX() + ":" + userId;

      boolean isLockSet;
      do {
         Boolean var5 = this.redis.setIfAbsent(lockKey, "1");
         if (var5 == null) {
            var5 = false;
         }

         isLockSet = var5;
      } while(!isLockSet);

      return true;
   }

   public void setUnLock(@NotNull String challengeToken) {
      Intrinsics.checkNotNullParameter(challengeToken, "challengeToken");
      String userId = this.getUserId(challengeToken);
      RedisTemplate var10000 = this.redisTemplate;
      String var10001 = this.getCONFIG_PREFIX();
      var10000.delete(var10001 + ":" + this.getLOCK_PREFIX() + ":" + userId);
   }

   public void doChangePassword(@NotNull String passResetToken, @NotNull String firstPassword, @NotNull String secondPassword) {
      Intrinsics.checkNotNullParameter(passResetToken, "passResetToken");
      Intrinsics.checkNotNullParameter(firstPassword, "firstPassword");
      Intrinsics.checkNotNullParameter(secondPassword, "secondPassword");
      if (!this.isExistPassResetToken(passResetToken)) {
         throw new UserServiceException("존재하지 않는 pass_reset_token 입니다.");
      } else if (firstPassword.length() >= 8 && firstPassword.length() <= 64) {
         if (!Intrinsics.areEqual(firstPassword, secondPassword)) {
            throw new UserServiceException("입력한 비밀번호가 동일하지 않습니다.");
         } else {
            ValueOperations var10000 = this.redis;
            String var10001 = this.getPASS_TOKEN_PREFIX();
            Object var7 = var10000.get(var10001 + ":" + passResetToken);
            Intrinsics.checkNotNull(var7);
            String userName = var7.toString();
            User var8 = this.userRepository.findUserByUsername(userName);
            if (var8 == null) {
               throw new UserServiceException("예상치 못한 에러가 발생 했습니다.");
            } else {
               User user = var8;
               String hashedPassword = PasswordHashKt.sha256(firstPassword);
               user.updatePassword(hashedPassword);
               this.userRepository.save(user);
               RedisTemplate var9 = this.redisTemplate;
               var10001 = this.getCONFIG_PREFIX();
               var9.delete(var10001 + ":" + userName);
            }
         }
      } else {
         throw new UserServiceException("비밀번호 길이를 확인해주세요.");
      }
   }
}
