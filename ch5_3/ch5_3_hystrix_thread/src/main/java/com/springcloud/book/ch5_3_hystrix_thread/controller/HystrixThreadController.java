package com.springcloud.book.ch5_3_hystrix_thread.controller;

import com.springcloud.book.ch5_3_hystrix_thread.config.HystrixThreadLocal;
import com.springcloud.book.ch5_3_hystrix_thread.service.HystrixThreadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/4
 * @Time: 19:38
 * @email: inwsy@hotmail.com
 * Description:
 */
@RestController
public class HystrixThreadController {

    private final Logger logger = LoggerFactory.getLogger(HystrixThreadController.class);

    @Autowired
    HystrixThreadService hystrixThreadService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam("id") Integer id) {
        //第一种测试，放入上下文对象
        HystrixThreadLocal.threadLocal.set("userId : "+ id);
        //第二种测试，利用RequestContextHolder放入对象测试
        RequestContextHolder.currentRequestAttributes().setAttribute("userId", "userId : "+ id, RequestAttributes.SCOPE_REQUEST);

        logger.info("ThreadContextController, Current thread: " + Thread.currentThread().getId());
        logger.info("ThreadContextController, Thread local: " + HystrixThreadLocal.threadLocal.get());
        logger.info("ThreadContextController, RequestContextHolder: " + RequestContextHolder.currentRequestAttributes().getAttribute("userId", RequestAttributes.SCOPE_REQUEST));
        //调用
        String user = hystrixThreadService.getUser(id);
        return user;
    }
}
