package com.springcloud.book.ch5_3_hystrix_cache.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import com.springcloud.book.ch5_3_hystrix_cache.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/3
 * @Time: 16:02
 * @email: inwsy@hotmail.com
 * Description:
 */
@Service
public class HelloServiceImpl implements HelloService {

    private Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @CacheResult
    @HystrixCommand
    public String hello(String name) {
        String json = restTemplate.getForObject("http://spring-cloud-provider-server/hello?name={name}", String.class, name);
        logger.info(json);
        return json;
    }

    @CacheResult
    @HystrixCommand(commandKey = "hello")
    public String helloCommandKey(String name) {
        String json = restTemplate.getForObject("http://spring-cloud-provider-server/hello?name={name}", String.class, name);
        logger.info(json);
        return json;
    }

    @CacheRemove(commandKey="hello")
    @HystrixCommand
    public String updateHello(String name) {
        logger.info("清除hello缓存成功");
        return "update success";
    }

}
