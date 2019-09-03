package com.springcloud.book.ch3_2_feign_okhttp.controller;

import com.springcloud.book.ch3_2_feign_okhttp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/searchApi")
    public String searchGithub(@RequestParam(value = "q") String query){
        return helloService.searchGithub(query);
    }
}
