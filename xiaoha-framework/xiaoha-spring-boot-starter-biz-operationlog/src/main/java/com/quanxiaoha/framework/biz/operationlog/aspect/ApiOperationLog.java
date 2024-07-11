package com.quanxiaoha.framework.biz.operationlog.aspect;

import java.lang.annotation.*;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/10 23:05
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {

    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}
