package com.springcloud.book.ch10_1_sleuth_provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/8/21 10:10
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(String name){
        log.info("provider name: {}", name);
        String massage = "hello, i am " + name;
        log.info("provider massage: {}", massage);
        return massage;
    }
}
