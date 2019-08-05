package com.springcloud.book.ch6_2_zuul_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/5
 * @Time: 22:53
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class TestZuulController {

    @GetMapping("/zuulHello")
    public String zuulHello() {
        return "Hello, this is Zuul Server";
    }
}
