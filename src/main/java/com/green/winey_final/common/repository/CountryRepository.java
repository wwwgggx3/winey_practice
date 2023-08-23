package com.green.winey_final.common.repository;

import com.green.winey_final.common.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity,Long> {
}
