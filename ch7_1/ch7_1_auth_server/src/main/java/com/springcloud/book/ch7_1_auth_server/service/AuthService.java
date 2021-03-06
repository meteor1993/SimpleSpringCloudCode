package com.springcloud.book.ch7_1_auth_server.service;

import com.springcloud.book.ch7_1_common.vo.CommonJson;

/**
 * @Date: 2019/8/12 10:45
 * @Version: 1.0
 * @Desc:
 */
public interface AuthService {
    CommonJson login(String loginName, String password);

    CommonJson refreshToken(String refreshToken);
}
