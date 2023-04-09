package com.example.demo.core.api.user.controller.dto;

import com.example.demo.core.api.user.domain.User;
import lombok.Getter;

@Getter
public class FindUserResponse {
    private final UserDto user;

    public FindUserResponse(User user) {
        this.user = new UserDto(user);
    }
}
