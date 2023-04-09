package com.example.demo.core.exception;

import lombok.Getter;

@Getter
public class CoreApiException extends RuntimeException{
    private final ErrorType errorType;
    private final String data;

    public CoreApiException(ErrorType errorType, String data) {
        super(errorType.getMessage());
        this.errorType = errorType;
        this.data = data;
    }
}
