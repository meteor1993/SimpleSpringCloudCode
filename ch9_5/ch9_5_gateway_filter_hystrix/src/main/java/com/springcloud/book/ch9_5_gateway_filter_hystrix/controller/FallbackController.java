package com.springcloud.book.ch9_5_gateway_filter_hystrix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daixueyun on 2019/8/20 0020.
 */
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback(){
        return "Spring Cloud Gateway Hystrix Filter Fallback!";
    }
}
