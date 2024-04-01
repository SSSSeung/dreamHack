package com.teamsa.piggybank.user.repository;

import com.teamsa.piggybank.user.domain.LoginLog;
import kotlin.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"},
   d2 = {"Lcom/teamsa/piggybank/user/repository/LoginLogRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/teamsa/piggybank/user/domain/LoginLog;", "", "piggybank"}
)
public interface LoginLogRepository extends JpaRepository<LoginLog, String> {
}
