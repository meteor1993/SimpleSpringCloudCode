package com.springcloud.book.ch3_2_feign_param_provider.controller;

import com.springcloud.book.ch3_2_feign_param_provider.entity.User;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by daixueyun on 2019/8/6 0006.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/single", method = RequestMethod.POST)
    public String singleHello(@RequestParam String name){
        return "hello " + name + ",this is single！";
    }

    @RequestMapping(value = "/multi", method = RequestMethod.POST)
    public String multiHello(@RequestParam String name, @RequestParam String age){
        return "hello " + name + ", " + age + "years old！";
    }

    @RequestMapping(value = "/map", method = RequestMethod.POST)
    public String mapHello(@RequestBody Map<String,String> map){
        return "hello " + map.get("name") + ", like playing " + map.get("hobby") + "！";
    }

    @RequestMapping(value = "/pojo", method = RequestMethod.POST)
    public String pojoHello(@RequestBody User user){
        return "hello " + user.getName() + ", number is " + user.getId() + "！";
    }
}
