package com.example.demo.core.api.order.repository;

import com.example.demo.core.api.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<Order, Long> {
}
