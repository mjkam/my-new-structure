package com.example.demo.core.api.order.controller.dto;

import lombok.Getter;

@Getter
public class CreateOrderRequest {
    private Long userId;
    private String orderInfo;
    private String comment;
}
