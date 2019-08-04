package com.springcloud.book.ch5_3_hystrix_collapsing.service;

import com.springcloud.book.ch5_3_hystrix_collapsing.provider.model.User;

import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/4
 * @Time: 17:48
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface HystrixCollapsingService {
    Future<User> collapsing(Integer id);
    User collapsingSyn(Integer id);
    Future<User> collapsingGlobal(Integer id);
}
