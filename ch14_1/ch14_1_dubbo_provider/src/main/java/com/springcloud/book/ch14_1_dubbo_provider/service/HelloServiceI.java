package com.springcloud.book.ch14_1_dubbo_provider.service;

import com.springcloud.book.ch14_1_dubbo_api.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/9/3
 * @Time: 21:55
 * @email: inwsy@hotmail.com
 * Description:
 */
@Service
public class HelloServiceI implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
