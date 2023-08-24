package com.green.winey_final.common.repository;

import com.green.winey_final.common.entity.UserRecommendEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRecommandRepository extends JpaRepository<UserRecommendEntity,Long> {
}
