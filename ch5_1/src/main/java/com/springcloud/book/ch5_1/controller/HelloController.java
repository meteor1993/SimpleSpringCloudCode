package com.springcloud.book.ch5_1.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/7/29
 * @Time: 22:55
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod="fallback")
    public String hello(@RequestParam String name) throws Exception {
        if(name.equals("spring")) {
            return "Hello " + name;
        }else {
            throw new Exception();
        }
    }

    public String fallback(@RequestParam String name) {
        return "Hello " + name + ", i am fallback massage";
    }
}
