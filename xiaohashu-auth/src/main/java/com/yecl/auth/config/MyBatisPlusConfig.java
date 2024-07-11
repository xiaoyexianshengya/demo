package com.yecl.auth.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/11 1:48
 */
@Configuration
public class MyBatisPlusConfig {

    @Bean
    public GlobalConfig globalConfig() {
        GlobalConfig globalConfig = new GlobalConfig();
        // 注册自定义的MetaObjectHandler
        globalConfig.setMetaObjectHandler(metaObjectHandler());
        return globalConfig;
    }

    @Bean
    public MetaObjectHandler metaObjectHandler() {
        return new CustomMetaObjectHandler();
    }

}
