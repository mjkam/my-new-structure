package com.example.demo.core.api.user.controller;

import com.example.demo.core.api.user.controller.dto.FindUserRequest;
import com.example.demo.core.api.user.controller.dto.FindUserResponse;
import com.example.demo.core.api.user.domain.User;
import com.example.demo.core.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public FindUserResponse findUser(@RequestBody FindUserRequest request) {
        User user = userService.findUser(request.getUserId());
        return new FindUserResponse(user);
    }
}
