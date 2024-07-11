package com.quanxiaoha.framework.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @ClassDescription: 统一响应对象
 * @Author: 小叶先生
 * @Created: 2024/7/10 20:14
 */
@Getter
@Setter
public class Result<T> implements Serializable {

    // 是否成功，默认为 true
    private boolean success = true;
    // 响应消息
    private String message;
    // 异常码
    private String code = "200";
    // 响应数据
    private T data;

    // =================================== 成功响应 ===================================
    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        return result;
    }

    // =================================== 失败响应 ===================================
    public static <T> Result<T> error() {
        Result<T> result = new Result<>();
        result.setSuccess(false);
        return result;
    }

    public static <T> Result<T> error(String errorMessage) {
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setMessage(errorMessage);
        return result;
    }

    public static <T> Result<T> error(String code, String errorMessage) {
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(errorMessage);
        return result;
    }

}
