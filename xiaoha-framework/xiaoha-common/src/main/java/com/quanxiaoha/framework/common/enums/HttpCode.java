package com.quanxiaoha.framework.common.enums;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/11 14:54
 */
public enum HttpCode {

    SUCCESS_CODE("200", "成功"),
    SERVICE_ERROR_CODE("500", "服务异常"),

    // ******************* 后续扩展开放接口，更详细的异常码 ****************** //
    PARAM_ERROR_CODE("5001", "参数异常"),
    OTHER_ERROR_CODE("9999", "其它异常"),
    ;


    HttpCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
