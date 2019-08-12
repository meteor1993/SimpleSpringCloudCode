package com.springcloud.book.ch7_1_auth_server.service.remote;

import com.springcloud.book.ch7_1_auth_server.service.fallback.AuthDataRemoteFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Date: 2019/8/12 10:46
 * @Version: 1.0
 * @Desc:
 */
@FeignClient(name = "spring-cloud-data-service", fallback= AuthDataRemoteFallback.class)
public interface AuthDataRemote {
    @PostMapping("/login")
    String login(@RequestParam(value = "loginName") String loginName, @RequestParam(value = "password") String password);
}
