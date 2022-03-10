package com.lucasmezencio.dsmovie.repositories;

import com.lucasmezencio.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
