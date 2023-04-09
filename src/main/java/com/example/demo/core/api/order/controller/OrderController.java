package com.example.demo.core.api.order.controller;

import com.example.demo.core.api.order.controller.dto.CreateOrderRequest;
import com.example.demo.core.api.order.controller.dto.CreateOrderResponse;
import com.example.demo.core.api.order.controller.dto.FindOrdersResponse;
import com.example.demo.core.api.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequiredArgsConstructor
@Validated
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/order")
    public CreateOrderResponse createOrder(@RequestBody CreateOrderRequest request) {
        return orderService.createOrder(
                request.getUserId(),
                request.getOrderInfo(),
                request.getComment());
    }

    @GetMapping("/orders")
    public FindOrdersResponse findOrders(
            @RequestParam @NotNull Integer page,
            @RequestParam int size
    ) {
        return orderService.findOrders(page, size);
    }
}
