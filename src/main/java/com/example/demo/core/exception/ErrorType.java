package com.example.demo.core.exception;

import lombok.Getter;
import org.springframework.boot.logging.LogLevel;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorType {
    DEFAULT_ERROR(
            HttpStatus.INTERNAL_SERVER_ERROR,
            "An unexpected error has occurred.",
            LogLevel.ERROR),

    ENTITY_NOT_FOUND_ERROR(
            HttpStatus.INTERNAL_SERVER_ERROR,
            "entity not found",
            LogLevel.ERROR),
    ;

    private final HttpStatus status;
    private final String message;
    private final LogLevel logLevel;

    ErrorType(HttpStatus status, String message, LogLevel logLevel) {
        this.status = status;
        this.message = message;
        this.logLevel = logLevel;
    }
}
