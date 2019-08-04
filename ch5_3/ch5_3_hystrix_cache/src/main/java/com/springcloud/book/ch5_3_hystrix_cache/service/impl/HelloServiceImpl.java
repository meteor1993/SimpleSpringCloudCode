package com.springcloud.book.ch5_3_hystrix_cache.service.impl;

import com.springcloud.book.ch5_3_hystrix_cache.service.HelloService;
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

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hello(String name) {
        String json = restTemplate.getForObject("http://spring-cloud-provider-server/hello?name={name}", String.class, name);
        System.out.println(json);
        return json;
    }

    @Override
    public String getUserToCommandKey(String name) {
        return null;
    }

    @Override
    public String updateUser(String name) {
        return null;
    }

}
