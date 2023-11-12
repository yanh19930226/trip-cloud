package com.trip.user.server.advice;

import com.trip.core.exception.BusinessException;
import com.trip.core.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public R<?> commonExceptionHandler(Exception e) {
        log.error("[统一异常处理] 拦截到其他异常", e);
        return R.defaultError();
    }

    @ExceptionHandler(BusinessException.class)
    public R<?> businessExceptionHandler(BusinessException e) {
        if (log.isDebugEnabled()) {
            log.debug("[统一异常处理] 拦截到业务异常", e);
        } else {
            log.warn("[统一异常处理] 拦截到业务异常, code={}, msg={}", e.getCode(), e.getMessage());
        }
        return R.error(e.getCode(), e.getMessage());
    }
}
