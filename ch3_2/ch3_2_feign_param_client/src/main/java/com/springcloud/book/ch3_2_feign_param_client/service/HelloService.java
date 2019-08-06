package com.springcloud.book.ch3_2_feign_param_client.service;

import com.springcloud.book.ch3_2_feign_param_client.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by daixueyun on 2019/8/6 0006.
 */
@FeignClient(name = "spring-cloud-feign-param-provider")
public interface HelloService {

    //1、单参数传递
    @RequestMapping(value = "/hello/single", method = RequestMethod.POST)
    String singleHello(@RequestParam(value = "name") String name);

    //2、多参数传递
    @RequestMapping(value = "/hello/multi", method = RequestMethod.POST)
    String multiHello(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age);

    //3、Map传递
    @RequestMapping(value = "/hello/map", method = RequestMethod.POST)
    String mapHello(@RequestBody Map<String,String> map);

    //4、pojo传递
    @RequestMapping(value = "/hello/pojo", method = RequestMethod.POST)
    String pojoHello(@RequestBody User user);
}
