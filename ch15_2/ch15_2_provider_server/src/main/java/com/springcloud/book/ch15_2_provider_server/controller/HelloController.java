package com.springcloud.book.ch15_2_provider_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/15
 * @Time: 15:47
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello Docker！";
    }
}
