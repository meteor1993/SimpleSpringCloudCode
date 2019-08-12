package com.springcloud.book.ch7_1_auth_server.service;

/**
 * @Date: 2019/8/12 10:45
 * @Version: 1.0
 * @Desc:
 */
public interface AuthService {
    String login(String loginName, String password);
}
