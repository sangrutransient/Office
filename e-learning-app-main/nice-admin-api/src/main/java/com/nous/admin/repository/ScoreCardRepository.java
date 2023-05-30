package com.nous.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nous.admin.entity.ScoreCardEntity;

@Repository
public interface ScoreCardRepository extends JpaRepository<ScoreCardEntity, Integer> {

}
