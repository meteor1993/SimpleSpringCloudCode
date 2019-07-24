package com.springcloud.book.ch2_2_eureka_client_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/7/24 9:28
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hi() {
        return "Hello, this is Zone-2";
    }
}
