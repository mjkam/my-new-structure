package com.example.demo.core.exception;

import lombok.Getter;

@Getter
public class ErrorResponse {
    private final String code;

    public ErrorResponse(String code) {
        this.code = code;
    }
}
