package com.example.demo.core.api.order.controller.dto;

import com.example.demo.core.api.order.domain.Order;
import com.example.demo.core.api.user.controller.dto.UserDto;
import com.example.demo.core.api.user.domain.User;
import lombok.Getter;

@Getter
public class CreateOrderResponse {
    private final UserDto user;
    private final OrderDto order;
    private final Integer randomEventNumber;

    public CreateOrderResponse(User user, Order order, int randomEventNumber) {
        this.user = new UserDto(user);
        this.order = new OrderDto(order);
        this.randomEventNumber = randomEventNumber;
    }
}
