package com.springcloud.book.ch3_1_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "github-api", url = "https://api.github.com")
public interface HelloService {

    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    String searchGithubApi(@RequestParam(value = "q") String query);
}
