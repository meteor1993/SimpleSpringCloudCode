package com.springcloud.book.ch3_1_feign_client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by daixueyun on 2019/7/31 0031.
 */
@FeignClient(name = "spring-cloud-feign-provider")
public interface HelloService {

    @RequestMapping(value = "hello")
    String hello(@RequestParam(value = "name") String name);
}
