package com.springcloud.book.ch3_2_feign_gzip.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by daixueyun on 2019/7/31 0031.
 */
@FeignClient(name = "github-api", url = "https://api.github.com")
public interface HelloService {

    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    ResponseEntity<byte[]> searchGithub(@RequestParam(value = "q") String query);
}
