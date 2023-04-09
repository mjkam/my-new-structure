package com.example.demo.core.api.user.repository;

import com.example.demo.core.api.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
