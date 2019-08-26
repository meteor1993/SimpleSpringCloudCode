package com.springcloud.book.ch11_1_consumer_server.controller;

import com.springcloud.book.ch11_1_consumer_server.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/26
 * @Time: 23:38
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/helloByFeign")
    public String helloByFeign() {
        return helloRemote.hello();
    }

    @GetMapping("/helloByRestTemplate")
    public String helloByRestTemplate() {
        return restTemplate.getForObject("http://spring-cloud-provider-server/hello/", String.class);
    }
}
