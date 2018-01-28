package com.kowalczk.model.http;

import lombok.Data;

/**
 * Created by JK on 2018-01-28.
 */
@Data
public class ApiError {

    private String message;
    private String faultCode;

    public ApiError(String message, String faultCode) {
        this.message = message;
        this.faultCode = faultCode;
    }
}
