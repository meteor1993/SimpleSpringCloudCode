package com.springcloud.book.ch8_4_config_apollo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/17
 * @Time: 15:49
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class HelloController {

    @Value("${com.springcloud.book.hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello() {
        return this.hello;
    }
}
