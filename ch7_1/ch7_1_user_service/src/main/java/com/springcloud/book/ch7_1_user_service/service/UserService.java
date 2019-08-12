package com.springcloud.book.ch7_1_user_service.service;

import com.springcloud.book.ch7_1_common.vo.CommonJson;

/**
 * @Date: 2019/8/12 10:45
 * @Version: 1.0
 * @Desc:
 */
public interface UserService {
    CommonJson getUserInfo(String userId);
}
