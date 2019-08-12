package com.springcloud.book.ch7_1_user_service.service.remote;

import com.springcloud.book.ch7_1_user_service.service.fallback.UserDataRemoteFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Date: 2019/8/12 10:46
 * @Version: 1.0
 * @Desc:
 */
@FeignClient(name = "spring-cloud-data-service", fallback= UserDataRemoteFallback.class)
public interface UserDataRemote {
    @PostMapping("/login")
    String login(@RequestParam(value = "loginName") String loginName, @RequestParam(value = "password") String password);

    @PostMapping("/getUserInfo")
    String getUserInfo(@RequestParam(value = "userLoginId") String userLoginId);

    @PostMapping("/getAllUserInfo")
    String getAllUserInfo();
}
