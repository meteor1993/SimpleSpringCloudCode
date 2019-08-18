package com.springcloud.book.ch8_3_config_client_mysql.controller;

import org.springframework.beans.factory.annotation.Value;
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
public class HelloController {

    @Value("${com.springcloud.book}")
    private String hello;

    @GetMapping("/hello")
    public String hello() {
        return this.hello;
    }
}
