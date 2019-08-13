package com.springcloud.book.ch7_1_data_service.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.springcloud.book.ch7_1_data_service.model.UserInfoModel;
import com.springcloud.book.ch7_1_data_service.model.UserLoginModel;
import com.springcloud.book.ch7_1_data_service.repository.UserInfoRepository;
import com.springcloud.book.ch7_1_data_service.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Date: 2019/8/12 9:42
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class UserController {

    @Autowired
    UserLoginRepository userLoginRepository;

    @Autowired
    UserInfoRepository userInfoRepository;

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam String loginName, @RequestParam String password) {
        return JSONObject.toJSONString(userLoginRepository.findAllByLoginNameAndPassword(loginName, password));
    }

    @PostMapping("/getUserInfo")
    @Cacheable(value = "user", key = "targetClass + methodName +#p0")
    public String getUserInfo(@RequestParam String userLoginId) {
        return JSONObject.toJSONString(userInfoRepository.getByUserLoginId(userLoginId));
    }
}
