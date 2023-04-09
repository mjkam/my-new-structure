package com.example.demo.core.api.order.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderUserId;

    private String orderInfo;

    private String comment;

    public Order(long orderUserId, String orderInfo, String comment) {
        this.orderUserId = orderUserId;
        this.orderInfo = orderInfo;
        this.comment = comment;
    }
}
