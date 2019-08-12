package com.springcloud.book.ch7_1_user_service.controller;

import com.springcloud.book.ch7_1_common.vo.CommonJson;
import com.springcloud.book.ch7_1_user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Date: 2019/8/12 14:09
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserInfo")
    @ResponseBody
    public CommonJson getUserInfo(@RequestParam String userId) {
        return userService.getUserInfo(userId);
    }
}
