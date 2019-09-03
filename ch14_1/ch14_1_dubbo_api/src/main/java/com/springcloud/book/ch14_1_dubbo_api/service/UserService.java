package com.springcloud.book.ch14_1_dubbo_api.service;

import com.springcloud.book.ch14_1_dubbo_api.model.UserModel;

import java.util.Collection;

/**
 * @Date: 2019/9/3 10:51
 * @Version: 1.0
 * @Desc:
 */
public interface UserService {
    boolean save(UserModel user);

    boolean remove(Long userId);

    Collection<UserModel> findAll();
}
