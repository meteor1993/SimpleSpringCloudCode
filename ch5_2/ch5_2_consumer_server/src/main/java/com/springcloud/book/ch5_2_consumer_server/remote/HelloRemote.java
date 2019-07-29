package com.springcloud.book.ch5_2_consumer_server.remote;

import com.springcloud.book.ch5_2_consumer_server.fallback.HelloRemoteFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "SPRING-CLOUD-PROVIDER-SERVER", fallback = HelloRemoteFallBack.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
