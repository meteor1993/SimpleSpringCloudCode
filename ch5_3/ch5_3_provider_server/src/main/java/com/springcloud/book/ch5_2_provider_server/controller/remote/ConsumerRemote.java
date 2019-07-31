package com.springcloud.book.ch5_2_provider_server.controller.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "SPRING-CLOUD-CONSUMER-SERVER")
public interface ConsumerRemote {

    @RequestMapping(value = "/helloProvider")
    String helloProvider();
}
