package com.springcloud.book.ch7_1_user_service.service;

/**
 * @Date: 2019/8/12 10:45
 * @Version: 1.0
 * @Desc:
 */
public interface UserService {
    String login(String loginName, String password);
    String getAllUserInfo();
}
