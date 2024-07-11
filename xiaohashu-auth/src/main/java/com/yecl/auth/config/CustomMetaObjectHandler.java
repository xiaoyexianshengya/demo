package com.yecl.auth.config;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/11 1:49
 */
public class CustomMetaObjectHandler implements MetaObjectHandler {

    // 实现自定义的字段填充逻辑
    @Override
    public void insertFill(MetaObject metaObject) {
        // 实现插入时的字段填充
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 实现更新时的字段填充
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

}
