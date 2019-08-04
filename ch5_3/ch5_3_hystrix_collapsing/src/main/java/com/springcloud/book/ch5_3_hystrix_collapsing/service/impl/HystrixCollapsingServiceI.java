package com.springcloud.book.ch5_3_hystrix_collapsing.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.springcloud.book.ch5_3_hystrix_collapsing.provider.model.User;
import com.springcloud.book.ch5_3_hystrix_collapsing.service.HystrixCollapsingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/4
 * @Time: 17:49
 * @email: inwsy@hotmail.com
 * Description:
 */
@Service
public class HystrixCollapsingServiceI implements HystrixCollapsingService {

    private final Logger logger = LoggerFactory.getLogger(HystrixCollapsingServiceI.class);

    @HystrixCollapser(batchMethod = "collapsingList", collapserProperties = {
            @HystrixProperty(name="timerDelayInMilliseconds", value = "1000")
    })
    public Future<User> collapsing(Integer id) {
        return null;
    }

    @HystrixCollapser(batchMethod = "collapsingList", collapserProperties = {
            @HystrixProperty(name="timerDelayInMilliseconds", value = "1000")
    })
    public User collapsingSyn(Integer id) {
        return null;
    }

    @HystrixCollapser(batchMethod = "collapsingListGlobal", scope = com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL, collapserProperties = {
            @HystrixProperty(name="timerDelayInMilliseconds", value = "1000")
    })
    public Future<User> collapsingGlobal(Integer id) {
        return null;
    }

    @HystrixCommand
    public List<User> collapsingList(List<Integer> userParams) {
        logger.info("collapsingList当前线程:" + Thread.currentThread().getName());
        logger.info("当前请求个数:" + userParams.size());

        List<User> animalList = new ArrayList<User>();

        for (Integer userNumber : userParams) {
            User user = new User();
            user.setName("spring-" + userNumber);
            user.setSex("man");
            user.setAge(userNumber);
            animalList.add(user);
        }
        return animalList;
    }

    @HystrixCommand
    public List<User> collapsingListGlobal(List<Integer> userParams) {
        logger.info("collapsingListGlobal当前线程:" + Thread.currentThread().getName());
        logger.info("当前请求个数:" + userParams.size());
        List<User> animalList = new ArrayList<User>();

        for (Integer userNumber : userParams) {
            User user = new User();
            user.setName("springcloud-" + userNumber);
            user.setSex("man");
            user.setAge(userNumber);
            animalList.add(user);
        }

        return animalList;
    }
}
