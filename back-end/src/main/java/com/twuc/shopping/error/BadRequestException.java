package com.twuc.shopping.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends HttpException {
    public BadRequestException(ErrorCode code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BadRequestException(ErrorCode code) {
        super(code);
    }

    public BadRequestException(ErrorCode code, String message) {
        super(code, message);
    }
}
