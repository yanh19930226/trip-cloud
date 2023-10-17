package com.trip.core.exception;

import com.trip.core.utils.R;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private Integer code = R.CODE_ERROR;

    public BusinessException() {
        super(R.MSG_ERROR);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
