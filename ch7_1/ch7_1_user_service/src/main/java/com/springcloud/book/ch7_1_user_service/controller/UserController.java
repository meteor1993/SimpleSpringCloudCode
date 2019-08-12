package com.springcloud.book.ch7_1_user_service.controller;

import com.springcloud.book.ch7_1_user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/8/12 14:09
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String loginName, @RequestParam String password) {
        return userService.login(loginName, password);
    }

    @PostMapping("/getAllUserInfo")
    public String getAllUserInfo() {
        return userService.getAllUserInfo();
    }
}
