package com.springcloud.book.ch6_1_client_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/5
 * @Time: 0:19
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        return "Hello, this server port is:" + request.getServerPort();
    }
}
