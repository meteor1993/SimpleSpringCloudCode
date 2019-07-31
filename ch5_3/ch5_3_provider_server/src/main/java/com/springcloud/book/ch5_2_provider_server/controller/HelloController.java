package com.springcloud.book.ch5_2_provider_server.controller;

import com.springcloud.book.ch5_2_provider_server.controller.remote.ConsumerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/7/29
 * @Time: 23:38
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    ConsumerRemote consumerRemote;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name + "，producer is ready";
    }

    @GetMapping(value = "/helloProvider")
    public String helloProvider() {
        return consumerRemote.helloProvider();
    }
}
