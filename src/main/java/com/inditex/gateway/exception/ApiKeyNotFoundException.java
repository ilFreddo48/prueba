package com.inditex.gateway.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ApiKeyNotFoundException extends Exception {

        private static final long serialVersionUID = 1L;

        public ApiKeyNotFoundException(String message) {
            super(message);
        }

        public ApiKeyNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }
}
