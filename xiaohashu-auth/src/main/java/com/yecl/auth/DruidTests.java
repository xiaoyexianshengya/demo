package com.yecl.auth;

import com.alibaba.druid.filter.config.ConfigTools;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassDescription:
 * @Author: 小叶先生
 * @Created: 2024/7/11 10:00
 */
@Slf4j
public class DruidTests {

    public static void main(String[] args) {
        try {
            //密码
            String password = "123456";
            String[] arr = ConfigTools.genKeyPair(512);

            //私钥
            log.info("privateKey: {}", arr[0]);
            //公钥
            log.info("publicKey: {}", arr[1]);

            //通过私钥加密密码
            String encodePassword = ConfigTools.encrypt(arr[0], password);
            log.info("password: {}", encodePassword);
        }catch (Exception e) {}
    }

}
