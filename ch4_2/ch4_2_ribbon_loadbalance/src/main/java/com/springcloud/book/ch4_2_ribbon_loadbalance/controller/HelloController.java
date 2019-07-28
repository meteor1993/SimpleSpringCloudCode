package com.springcloud.book.ch4_2_ribbon_loadbalance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/7/28
 * @Time: 20:13
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return restTemplate.getForObject("http://spring-cloud-client/hello", String.class);
    }
}
