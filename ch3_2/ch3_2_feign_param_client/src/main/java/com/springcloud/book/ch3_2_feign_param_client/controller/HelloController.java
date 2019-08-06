package com.springcloud.book.ch3_2_feign_param_client.controller;

import com.springcloud.book.ch3_2_feign_param_client.entity.User;
import com.springcloud.book.ch3_2_feign_param_client.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daixueyun on 2019/8/6 0006.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/single", method = RequestMethod.POST)
    public String singleHello(@RequestParam(value = "name") String name){
        return helloService.singleHello(name);
    }

    @RequestMapping(value = "/multi", method = RequestMethod.POST)
    public String multiHello(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age){
        return helloService.multiHello(name, age);
    }

    @RequestMapping(value = "/map", method = RequestMethod.POST)
    public String mapHello(@RequestParam(value = "name") String name, @RequestParam(value = "hobby") String hobby){
        Map<String, String> map = new HashMap<>();
        map.put("name",name);
        map.put("hobby",hobby);
        return helloService.mapHello(map);
    }

    @RequestMapping(value = "/pojo", method = RequestMethod.POST)
    public String pojoHello(@RequestParam(value = "name") String name, @RequestParam(value = "id", required = false) String id){
        User user = new User();
        user.setName(name);
        user.setId(id);
        return helloService.pojoHello(user);
    }
}
