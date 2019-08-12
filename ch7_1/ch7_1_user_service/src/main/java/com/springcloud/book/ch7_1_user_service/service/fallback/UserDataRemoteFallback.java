package com.springcloud.book.ch7_1_user_service.service.fallback;

import com.springcloud.book.ch7_1_user_service.service.remote.UserDataRemote;
import org.springframework.stereotype.Component;

/**
 * @Date: 2019/8/12 10:47
 * @Version: 1.0
 * @Desc:
 */
@Component
public class UserDataRemoteFallback implements UserDataRemote {
    @Override
    public String login(String loginName, String password) {
        return "login failed";
    }

    @Override
    public String getUserInfo(String userLoginId) {
        return "getUserInfo failed";
    }

    @Override
    public String getAllUserInfo() {
        return "getAllUserInfo failed";
    }
}
