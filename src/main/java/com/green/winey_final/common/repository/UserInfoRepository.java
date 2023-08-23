package com.green.winey_final.common.repository;

import com.green.winey_final.common.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity,Long> {
}
