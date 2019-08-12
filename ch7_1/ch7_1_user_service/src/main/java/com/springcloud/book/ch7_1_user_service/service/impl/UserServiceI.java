package com.springcloud.book.ch7_1_user_service.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.springcloud.book.ch7_1_user_service.service.UserService;
import com.springcloud.book.ch7_1_user_service.service.remote.UserDataRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date: 2019/8/12 14:04
 * @Version: 1.0
 * @Desc:
 */
@Service
public class UserServiceI implements UserService {

    @Autowired
    UserDataRemote userDataRemote;

    @Override
    public String login(String loginName, String password) {
        String userLoginId = JSONObject.parseObject(userDataRemote.login(loginName, password)).getString("id");
        return  userDataRemote.getUserInfo(userLoginId);
    }

    @Override
    public String getAllUserInfo() {
        return userDataRemote.getAllUserInfo();
    }
}
