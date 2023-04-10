package com.inditex.gateway.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class ApiKeyException extends Exception {

    private static final long serialVersionUID = 1L;

    public ApiKeyException(String message) {
        super(message);
    }

    public ApiKeyException(String message, Throwable cause) {
        super(message, cause);
    }
}
