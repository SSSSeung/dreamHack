package com.teamsa.piggybank.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000eH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"},
   d2 = {"Lcom/teamsa/piggybank/config/RedisConfig;", "", "host", "", "port", "", "(Ljava/lang/String;I)V", "getHost", "()Ljava/lang/String;", "getPort", "()I", "redisConnectionFactory", "Lorg/springframework/data/redis/connection/RedisConnectionFactory;", "redisTemplate", "Lorg/springframework/data/redis/core/RedisTemplate;", "piggybank"}
)
public class RedisConfig {
   @NotNull
   private final String host;
   private final int port;

   public RedisConfig(@Value("${spring.redis.host}") @NotNull String host, @Value("${spring.redis.port}") int port) {
      Intrinsics.checkNotNullParameter(host, "host");
      super();
      this.host = host;
      this.port = port;
   }

   @NotNull
   public String getHost() {
      return this.host;
   }

   public int getPort() {
      return this.port;
   }

   @Bean
   @NotNull
   public RedisConnectionFactory redisConnectionFactory() {
      return (RedisConnectionFactory)(new LettuceConnectionFactory(this.getHost(), this.getPort()));
   }

   @Bean
   @NotNull
   public RedisTemplate<?, ?> redisTemplate() {
      RedisTemplate var1 = new RedisTemplate();
      int var3 = false;
      var1.setConnectionFactory(this.redisConnectionFactory());
      var1.setKeySerializer((RedisSerializer)(new StringRedisSerializer()));
      var1.setHashKeySerializer((RedisSerializer)(new StringRedisSerializer()));
      var1.setValueSerializer((RedisSerializer)(new StringRedisSerializer()));
      return var1;
   }
}
