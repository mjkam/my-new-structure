package com.example.demo.core.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ApiControllerAdvice {
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public void handleException(MethodArgumentTypeMismatchException e) {
        System.out.println("MethodArgumentTypeMismatchException");
        System.out.println(e.getClass().getName());
    }

    @ExceptionHandler(Exception.class)
    public void handleException(Exception e) {
        System.out.println("Exception");
        System.out.println(e.getClass().getName());
    }
}
