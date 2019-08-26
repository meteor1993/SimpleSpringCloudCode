package com.springcloud.book.ch11_1_provider_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/26
 * @Time: 23:30
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello, port is: " + request.getLocalPort();
    }
}
