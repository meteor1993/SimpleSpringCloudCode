package com.springcloud.book.ch7_1_auth_server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.springcloud.book.ch7_1_auth_server.service.AuthService;
import com.springcloud.book.ch7_1_auth_server.service.remote.AuthDataRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date: 2019/8/12 14:04
 * @Version: 1.0
 * @Desc:
 */
@Service
public class AuthServiceI implements AuthService {

    @Autowired
    AuthDataRemote authDataRemote;

    @Override
    public String login(String loginName, String password) {
        String userLoginId = JSONObject.parseObject(authDataRemote.login(loginName, password)).getString("id");
        return  authDataRemote.getUserInfo(userLoginId);
    }
}
