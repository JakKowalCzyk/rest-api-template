package com.kowalczyk.model.exception;

import lombok.Data;

/**
 * Created by JK on 2018-01-28.
 */
@Data
public class GenericException extends RuntimeException {

    private String code;

    public GenericException(String message, String code) {
        super(message);
    }
}
