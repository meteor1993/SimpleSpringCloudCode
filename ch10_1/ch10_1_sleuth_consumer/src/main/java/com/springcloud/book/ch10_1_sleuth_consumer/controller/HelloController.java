package com.springcloud.book.ch10_1_sleuth_consumer.controller;

import com.springcloud.book.ch10_1_sleuth_consumer.remote.HelloRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @Date: 2019/8/21 10:22
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloRemote helloRemote;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ExecutorService executorService;

    @GetMapping("/helloByFeign")
    public String helloByFeign(String name){
        log.info("consumer feign, name: {}", name);

        String massage = helloRemote.hello(name);

        log.info("consumer received, massage: {}", massage);
        return massage;
    }

    @GetMapping("/helloByRestTemplate")
    public String helloByRestTemplate(String name){
        log.info("consumer helloByRestTemplate, name: {}", name);

        String url = "http://localhost:8000/hello?name=" + name;
        String massage = restTemplate.getForObject(url, String.class);

        log.info("consumer received, massage: {}", massage);

        return massage;
    }

    @GetMapping("/helloByNewThread")
    public String hello(String name) throws ExecutionException, InterruptedException {
        log.info("consumer helloByNewThread. name: {}", name);

        Future future = executorService.submit(() -> {
            log.info("consumer helloByNewThread. new thread, name: {}", name);
            String massage = helloRemote.hello(name);
            return massage;
        });
        String result = (String) future.get();
        log.info("consumer received. main thread, name: {}", result);
        return result;
    }
}
