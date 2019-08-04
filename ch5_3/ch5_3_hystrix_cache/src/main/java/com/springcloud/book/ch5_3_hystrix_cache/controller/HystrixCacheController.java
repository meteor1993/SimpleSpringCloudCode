package com.springcloud.book.ch5_3_hystrix_cache.controller;

import com.springcloud.book.ch5_3_hystrix_cache.service.HelloCommand;
import com.springcloud.book.ch5_3_hystrix_cache.service.HelloService;
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

    @Autowired
    HelloService helloService;

    /**
     * 使用继承类方式
     * @param name
     * @return
     */
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

    /**
     * 使用注解方式
     * 缓存测试
     * @param name
     * @return
     */
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
       helloService.hello(name);
       helloService.hello(name);
        return "success";
    }

    /**
     * 缓存更新测试
     * @param name
     * @return
     */
    @GetMapping("/helloUpdate")
    public String helloUpdate(@RequestParam("name") String name) {
        helloService.hello(name);
        helloService.hello(name);
        helloService.hello("springcloud");
        return "success";
    }

    @GetMapping("/removeHello")
    public String removeHello(@RequestParam("name") String name) {
        // 调用接口并缓存数据
        helloService.helloCommandKey(name);
        helloService.helloCommandKey(name);
        // 清除缓存
        helloService.updateHello(name);
        // 再次调用接口
        helloService.helloCommandKey(name);
        helloService.helloCommandKey(name);
        return "success";
    }
}
