package com.springcloud.book.ch3_2_feign_okhttp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "feign-okhttp", url = "https://api.github.com")
public interface HelloService {

    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    String searchGithub(@RequestParam(value = "q") String query);
}
