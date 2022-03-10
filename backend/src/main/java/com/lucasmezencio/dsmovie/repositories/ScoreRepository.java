package com.lucasmezencio.dsmovie.repositories;

import com.lucasmezencio.dsmovie.entities.Score;
import com.lucasmezencio.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
