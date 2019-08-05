package com.springcloud.book.ch6_2_client_server_a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Date: 2019/8/5 15:35
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello, this server port is:" + request.getServerPort();
    }
}
