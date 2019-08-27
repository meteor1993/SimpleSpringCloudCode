package com.springcloud.book.ch11_2_client_config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

/**
 * @Date: 2019/8/27 15:30
 * @Version: 1.0
 * @Desc:
 */
@RefreshScope
@RestController
public class HelloController {
    @Value("${user.github}")
    private String github;

    @Value("${user.email}")
    private String email;

    @GetMapping("/hello")
    public String hello() {
        return MessageFormat.format("Hello, my github is {0} and email is {1}.", github, email);
    }
}
