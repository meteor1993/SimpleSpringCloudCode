package com.springcloud.book.ch5_3_hystrix_collapsing.controller;

import com.springcloud.book.ch5_3_hystrix_collapsing.provider.model.User;
import com.springcloud.book.ch5_3_hystrix_collapsing.service.HystrixCollapsingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/4
 * @Time: 18:21
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HystrixCollapsingController {

    private final Logger logger = LoggerFactory.getLogger(HystrixCollapsingController.class);

    @Autowired
    HystrixCollapsingService hystrixCollapsingService;

    /**
     * 请求聚合/合并
     * @return
     * @throws Exception
     */
    @GetMapping("/getUser")
    public String getUser() throws Exception {
        Future<User> user = hystrixCollapsingService.collapsing(1);
        Future<User> user2 = hystrixCollapsingService.collapsing(2);
        logger.info(user.get().getName());
        logger.info(user2.get().getName());
        return "Success";
    }

    /**
     * 返回值必须是Future，否则不会进行合并/聚合，测试未合并
     * @return
     */
    @GetMapping("/getUserSyn")
    public String getUserSyn() {
        User user = hystrixCollapsingService.collapsingSyn(1);
        User user2 = hystrixCollapsingService.collapsingSyn(2);
        logger.info(user.getName());
        logger.info(user2.getName());
        return "Success";
    }

    /**
     * 请求聚合/合并,整个应用的
     * @return
     * @throws Exception
     */
    @GetMapping("/getUserGolbal")
    public String getUserGolbal() throws Exception {
        Future<User> user = hystrixCollapsingService.collapsingGlobal(1);
        Future<User> user2 = hystrixCollapsingService.collapsingGlobal(2);
        logger.info(user.get().getName());
        logger.info(user2.get().getName());
        return "Success";
    }
}
