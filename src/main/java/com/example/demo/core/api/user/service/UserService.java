package com.example.demo.core.api.user.service;

import com.example.demo.core.api.user.domain.User;
import com.example.demo.core.api.user.repository.UserJpaRepository;
import com.example.demo.core.exception.CoreApiException;
import com.example.demo.core.exception.ErrorType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserJpaRepository userJpaRepository;

    public User findUser(long userId) {
        return userJpaRepository.findById(userId)
                .orElseThrow(() -> new CoreApiException(ErrorType.ENTITY_NOT_FOUND_ERROR, "userId: " + userId));
    }
}
