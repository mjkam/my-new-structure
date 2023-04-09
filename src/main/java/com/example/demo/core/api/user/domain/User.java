package com.example.demo.core.api.user.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "test_user")
@NoArgsConstructor
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String password;

    private String name;

    private Integer vipPoint;

    private Integer buyCount;

    public void update() {
        this.buyCount++;
    }
}
