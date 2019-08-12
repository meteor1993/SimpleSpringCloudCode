package com.springcloud.book.ch7_1_auth_server.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.springcloud.book.ch7_1_auth_server.service.AuthService;
import com.springcloud.book.ch7_1_auth_server.service.remote.AuthDataRemote;
import com.springcloud.book.ch7_1_common.util.JWTUtil;
import com.springcloud.book.ch7_1_common.vo.CommonJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Date: 2019/8/12 14:04
 * @Version: 1.0
 * @Desc:
 */
@Service
public class AuthServiceI implements AuthService {

    @Autowired
    AuthDataRemote authDataRemote;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public CommonJson login(String loginName, String password) {
        String userId = JSONObject.parseObject(authDataRemote.login(loginName, password)).getString("id");
        CommonJson json = new CommonJson();
        Map<String, Object> data = Maps.newHashMap();
        if (!StringUtils.isEmpty(userId)) {
            // 如果登录成功，则签发token

            // 生成token
            String token = JWTUtil.generateToken(userId);

            //生成refreshToken
            String refreshToken = UUID.randomUUID().toString();

            //数据放入redis
            redisTemplate.opsForHash().put(refreshToken, "token", token);
            redisTemplate.opsForHash().put(refreshToken, "userId", userId);

            //设置token的过期时间
            redisTemplate.expire(refreshToken, JWTUtil.REFRESH_TOKEN_EXPIRE_TIME, TimeUnit.MILLISECONDS);

            data.put("token", token);
            data.put("refreshToken", refreshToken);

            json.setResultCode("1");
            json.setResultData(data);
            json.setResultMsg("login success");

            return json;
        } else {
            json.setResultCode("0");
            json.setResultMsg("login failed");
            return json;
        }
    }

    @Override
    public CommonJson refreshToken(String refreshToken) {
        String userId = redisTemplate.opsForHash().get(refreshToken, "userId").toString();
        CommonJson json = new CommonJson();
        Map<String, Object> data = Maps.newHashMap();
        if(StringUtils.isEmpty(userId)){
            json.setResultCode("0");
            json.setResultMsg("refreshToken failed");
            return json;
        }

        //生成新的token
        String newToken = JWTUtil.generateToken(userId);
        redisTemplate.opsForHash().put(refreshToken, "token", newToken);
        data.put("token", newToken);

        json.setResultCode("1");
        json.setResultData(data);
        json.setResultMsg("refreshToken success");

        return json;
    }
}
