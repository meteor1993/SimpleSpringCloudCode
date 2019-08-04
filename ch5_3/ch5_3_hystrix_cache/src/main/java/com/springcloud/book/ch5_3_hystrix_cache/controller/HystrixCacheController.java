package com.springcloud.book.ch5_3_hystrix_cache.controller;

import com.springcloud.book.ch5_3_hystrix_cache.service.HelloCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/3
 * @Time: 15:38
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HystrixCacheController {

    private static final Logger log = LoggerFactory.getLogger(HystrixCacheController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/helloByExtendCommand")
    public String helloByExtendCommand(@RequestParam("name") String name) {
        HelloCommand one = new HelloCommand(restTemplate, name);

        one.execute();
        log.info("from cache:   " + one.isResponseFromCache());
        HelloCommand two = new HelloCommand(restTemplate, name);
        two.execute();
        log.info("from cache:   " + two.isResponseFromCache());

        return "success";
    }

}
