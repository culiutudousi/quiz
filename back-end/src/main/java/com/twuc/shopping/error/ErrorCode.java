package com.twuc.shopping.error;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import com.google.common.collect.ImmutableSet;

public enum ErrorCode {
    INVALID_REQUEST(10000, "invalid request");

    private static final Set<String> ERROR_CODE_VALUES = ImmutableSet.copyOf(
            Arrays.stream(values()).map(Enum::toString).collect(Collectors.toSet())
    );

    private final int code;

    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static boolean contains(String code) {
        return ERROR_CODE_VALUES.contains(code);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @JsonValue
    public ErrorMessage toErrorMessage() {
        return new ErrorMessage(code, message, new HashMap<>());
    }
}
