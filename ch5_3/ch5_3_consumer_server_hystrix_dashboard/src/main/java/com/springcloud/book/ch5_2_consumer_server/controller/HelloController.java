package com.springcloud.book.ch5_2_consumer_server.controller;

import com.springcloud.book.ch5_2_consumer_server.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/7/29
 * @Time: 23:43
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return helloRemote.hello(name);
    }

    @GetMapping(value = "/helloProvider")
    public String helloProvider() {
        return "helloProvider";
    }
}
