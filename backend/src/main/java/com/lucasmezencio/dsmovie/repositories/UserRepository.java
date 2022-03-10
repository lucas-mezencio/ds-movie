package com.lucasmezencio.dsmovie.repositories;

import com.lucasmezencio.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
