package com.yecl.auth.controller;

import com.quanxiaoha.framework.biz.operationlog.aspect.ApiOperationLog;
import com.quanxiaoha.framework.common.Result;
import com.yecl.auth.entity.UserEntity;
import com.yecl.auth.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/10 20:22
 */
@RestController
public class TestController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Result test(){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("叶先生");
        userMapper.insert(userEntity);
        return Result.success(userEntity);
    }

    @GetMapping("/test/list")
    @ApiOperationLog(description = "测试接口")
    public Result getAll(){
        return Result.success(userMapper.getAll());
    }

}
