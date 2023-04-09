package com.example.demo.core.api.user.controller.dto;

import com.example.demo.core.api.user.domain.User;
import lombok.Getter;

@Getter
public class UserDto {
    private final String name;
    private final Integer vipPoint;

    public UserDto(User user) {
        this.name = user.getName();
        this.vipPoint = user.getVipPoint();
    }
}
