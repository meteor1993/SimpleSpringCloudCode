package com.springcloud.book.ch9_5_gateway_filter_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by daixueyun on 2019/8/16 0016.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/addRequestHeader")
    public String addRequestHeader(HttpServletRequest request){
        String header = request.getHeader("X-Request-hello");
        return "addRequestHeader-------------------------header:"+header;
    }

    @RequestMapping("/addRequestParameter")
    public String addRequestParameter(HttpServletRequest request){
        String name = request.getParameter("name");
        return "addRequestParameter-------------------------name:"+name;
    }

    @RequestMapping("/hystrix")
    public String hystrix(HttpServletRequest request){
        return "hystrix-------------------------success";
    }

    @RequestMapping("/prefixPath")
    public String prefixPath(HttpServletRequest request){
        return "prefixPath-------------------------success";
    }

    @RequestMapping("/retry")
    public String retry(HttpServletRequest request){
        return "retry-------------------------success";
    }

}
