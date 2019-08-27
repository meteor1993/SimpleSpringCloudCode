package com.springcloud.book.ch11_1_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/8/27 15:30
 * @Version: 1.0
 * @Desc:
 */
@RefreshScope
@RestController
public class HelloController {
    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private String age;

    @GetMapping("/hello")
    public String hello() {
        return "name:" + name + ",age:" + age;
    }
}
