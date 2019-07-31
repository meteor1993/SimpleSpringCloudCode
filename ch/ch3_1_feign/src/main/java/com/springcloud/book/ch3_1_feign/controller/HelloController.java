package com.springcloud.book.ch3_1_feign.controller;

import com.springcloud.book.ch3_1_feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: daixueyun
 * @Description:
 * @Date: Create in 19:57 2019/7/30
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "searchApi")
    public String searchApi(@RequestParam(value = "q") String query){
        return helloService.searchGithubApi(query);
    }
}
