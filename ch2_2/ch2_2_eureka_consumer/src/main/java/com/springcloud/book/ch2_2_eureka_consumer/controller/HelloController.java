package com.springcloud.book.ch2_2_eureka_consumer.controller;

import com.springcloud.book.ch2_2_eureka_consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shiyao.wei
 * @Date: 2019/7/24 10:40
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello")
    public String index() {
        return helloRemote.hello();
    }
}
