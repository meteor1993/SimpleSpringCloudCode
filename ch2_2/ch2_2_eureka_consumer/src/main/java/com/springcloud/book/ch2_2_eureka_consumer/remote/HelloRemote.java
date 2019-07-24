package com.springcloud.book.ch2_2_eureka_consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date: 2019/7/24 10:37
 * @Version: 1.0
 * @Desc:
 */
@FeignClient(name= "spring-cloud-eureka-client")
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String hello();

}
