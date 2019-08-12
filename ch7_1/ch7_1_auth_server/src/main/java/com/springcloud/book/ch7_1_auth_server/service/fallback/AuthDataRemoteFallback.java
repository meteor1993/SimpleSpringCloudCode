package com.springcloud.book.ch7_1_auth_server.service.fallback;

import com.springcloud.book.ch7_1_auth_server.service.remote.AuthDataRemote;
import org.springframework.stereotype.Component;

/**
 * @Date: 2019/8/12 10:47
 * @Version: 1.0
 * @Desc:
 */
@Component
public class AuthDataRemoteFallback implements AuthDataRemote {
    @Override
    public String login(String loginName, String password) {
        return "login failed";
    }
}
