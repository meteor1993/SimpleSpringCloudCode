package com.springcloud.book.ch4_2_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Date: 2019/7/25 15:34
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello Ribbon, From Port:" + request.getServerPort();
    }
}
