package com.springcloud.book.ch3_1_feign_provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daixueyun on 2019/7/31 0031.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String hello(@RequestParam String name){
        return "Hello " + name + ",this is provider!";
    }
}
