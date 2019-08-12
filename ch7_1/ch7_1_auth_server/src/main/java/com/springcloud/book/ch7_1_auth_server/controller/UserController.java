package com.springcloud.book.ch7_1_auth_server.controller;

import com.springcloud.book.ch7_1_auth_server.service.AuthService;
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
    AuthService authService;

    @PostMapping("/login")
    public String login(@RequestParam String loginName, @RequestParam String password) {
        return authService.login(loginName, password);
    }
}
