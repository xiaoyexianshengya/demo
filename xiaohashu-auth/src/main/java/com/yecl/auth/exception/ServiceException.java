package com.yecl.auth.exception;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/11 14:48
 */

import com.quanxiaoha.framework.common.enums.HttpCode;

public class ServiceException extends RuntimeException {

    private String errorCode;

    public ServiceException(String message) {
        super(message);
        this.errorCode = HttpCode.SERVICE_ERROR_CODE.getCode();
    }

    public String getErrorCode() {
        return errorCode;
    }

}
