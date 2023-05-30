package com.nous.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nous.admin.entity.ScoreVariantEntity;

@Repository
public interface ScoreVariantRepository extends JpaRepository<ScoreVariantEntity, Integer>{

}
