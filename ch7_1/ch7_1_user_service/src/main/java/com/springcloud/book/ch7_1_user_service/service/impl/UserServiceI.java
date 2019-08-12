package com.springcloud.book.ch7_1_user_service.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.springcloud.book.ch7_1_common.vo.CommonJson;
import com.springcloud.book.ch7_1_common.vo.UserInfoModel;
import com.springcloud.book.ch7_1_user_service.service.UserService;
import com.springcloud.book.ch7_1_user_service.service.remote.UserDataRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

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
    public CommonJson getUserInfo(String userId) {
        CommonJson json = new CommonJson();

        UserInfoModel userInfoModel = JSON.parseObject(userDataRemote.getUserInfo(userId), UserInfoModel.class);

        Map<String, Object> data = Maps.newHashMap();
        data.put("userInfo", userInfoModel);

        json.setResultCode("1");
        json.setResultMsg("success");
        json.setResultData(data);

        return json;
    }
}
