package com.zwj.framework.auth.exception;

import lombok.Getter;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 11:16 AM
 * @description:
 */
public class AccessDenyException extends RuntimeException {

    @Getter
    String code;

    public AccessDenyException() {
        this("无权限，拒绝访问!");
    }

    public AccessDenyException(String message) {
        super(message);
    }

    public AccessDenyException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessDenyException(Throwable cause) {
        super(cause);
    }

    public AccessDenyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
