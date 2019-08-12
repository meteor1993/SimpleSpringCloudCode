package com.springcloud.book.ch7_1_auth_server.controller;

import com.springcloud.book.ch7_1_auth_server.service.AuthService;
import com.springcloud.book.ch7_1_common.vo.CommonJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Date: 2019/8/12 14:09
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping("/login")
    @ResponseBody
    public CommonJson login(@RequestParam String loginName, @RequestParam String password) {
        return authService.login(loginName, password);
    }

    @GetMapping("/refreshToken")
    @ResponseBody
    public CommonJson refreshToken(@RequestParam String refreshToken) {
        return authService.refreshToken(refreshToken);
    }
}
