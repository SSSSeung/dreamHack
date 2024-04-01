package com.teamsa.piggybank.config;

import jakarta.servlet.Filter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0017¨\u0006\u0006"},
   d2 = {"Lcom/teamsa/piggybank/config/WebConfig;", "", "()V", "requestLoggingFilter", "Lorg/springframework/boot/web/servlet/FilterRegistrationBean;", "Lcom/teamsa/piggybank/config/LogFilter;", "piggybank"}
)
public class WebConfig {
   @Bean
   @NotNull
   public FilterRegistrationBean<LogFilter> requestLoggingFilter() {
      FilterRegistrationBean registrationBean = new FilterRegistrationBean();
      registrationBean.setFilter((Filter)(new LogFilter()));
      String[] var2 = new String[]{"/*"};
      registrationBean.addUrlPatterns(var2);
      return registrationBean;
   }
}
