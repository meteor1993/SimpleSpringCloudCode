package com.springcloud.book.ch9_3_gateway_provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daixueyun on 2019/8/13 0013.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String hello(@RequestParam String name){
        return "Hello " + name + ",this is provider!";
    }
}