package com.example.demo.core.api.order.controller.dto;

import com.example.demo.core.api.order.domain.Order;
import lombok.Getter;

@Getter
public class OrderDto {
    private final Long id;
    private final Long orderUserId;
    private final String orderInfo;
    private final String comment;

    public OrderDto(Order order) {
        this.id = order.getId();
        this.orderUserId = order.getOrderUserId();
        this.orderInfo = order.getOrderInfo();
        this.comment = order.getComment();
    }
}
