package com.springcloud.book.ch3_2_feign_gzip.controller;

import com.springcloud.book.ch3_2_feign_gzip.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<byte[]> searchGithub(@RequestParam(value = "q") String query){
        return helloService.searchGithub(query);
    }
}
