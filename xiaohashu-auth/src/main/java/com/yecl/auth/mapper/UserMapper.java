package com.yecl.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yecl.auth.entity.UserEntity;

import java.util.List;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/11 1:00
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    List<UserEntity> getAll();

}
