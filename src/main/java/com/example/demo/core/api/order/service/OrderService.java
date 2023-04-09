package com.example.demo.core.api.order.service;

import com.example.demo.core.api.order.controller.dto.CreateOrderResponse;
import com.example.demo.core.api.order.controller.dto.FindOrdersResponse;
import com.example.demo.core.api.order.domain.Order;
import com.example.demo.core.api.order.repository.OrderJpaRepository;
import com.example.demo.core.api.user.domain.User;
import com.example.demo.core.api.user.repository.UserJpaRepository;
import com.example.demo.core.exception.CoreApiException;
import com.example.demo.core.exception.ErrorType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final UserJpaRepository userJpaRepository;
    private final OrderJpaRepository orderJpaRepository;

    @Transactional
    public CreateOrderResponse createOrder(Long userId, String orderInfo, String comment) {
        Order order = new Order(userId, orderInfo, comment);
        order = orderJpaRepository.save(order);

        User user = userJpaRepository.findById(userId)
                .orElseThrow(() -> new CoreApiException(ErrorType.ENTITY_NOT_FOUND_ERROR, "userId: " + userId));
        user.update();

        return new CreateOrderResponse(user, order, createRandomEventNumber());
    }

    private int createRandomEventNumber() {
        return ThreadLocalRandom.current().nextInt(1, 1000000000);
    }

    public FindOrdersResponse findOrders(int page, int size) {
        return null;
    }
}
