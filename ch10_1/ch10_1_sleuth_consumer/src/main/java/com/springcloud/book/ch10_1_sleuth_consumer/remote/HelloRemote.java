package com.springcloud.book.ch10_1_sleuth_consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Date: 2019/8/21 10:20
 * @Version: 1.0
 * @Desc:
 */
@FeignClient(name = "spring-cloud-sleuth-provider",url = "localhost:8000")
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestParam("name")String name);
}
