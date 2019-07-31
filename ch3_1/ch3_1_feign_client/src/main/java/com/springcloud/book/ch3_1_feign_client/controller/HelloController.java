package com.springcloud.book.ch3_1_feign_client.controller;

import com.springcloud.book.ch3_1_feign_client.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daixueyun on 2019/7/31 0031.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloService.hello(name);
    }
}
