package com.example.demo.core.api.order.controller.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class FindOrdersResponse {
    private final List<OrderDto> orders;

    public FindOrdersResponse(List<OrderDto> orders) {
        this.orders = orders;
    }
}
