package com.yecl.auth.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/10 23:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

}
