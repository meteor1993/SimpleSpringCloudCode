package com.springcloud.book.ch5_3_hystrix_thread.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.book.ch5_3_hystrix_thread.config.HystrixThreadLocal;
import com.springcloud.book.ch5_3_hystrix_thread.service.HystrixThreadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: weishiyao
 * @Date: 2019/8/4
 * @Time: 19:25
 * @email: inwsy@hotmail.com
 * Description:
 */
@Service
public class HystrixThreadServiceI implements HystrixThreadService {

    private final Logger log = LoggerFactory.getLogger(HystrixThreadServiceI.class);

    public String getUser(Integer id) {
        log.info("HystrixThreadService, Current thread : " + Thread.currentThread().getId());
        log.info("HystrixThreadService, Thread object : " + HystrixThreadLocal.threadLocal.get());
        log.info("HystrixThreadService, RequestContextHolder : " + RequestContextHolder.currentRequestAttributes().getAttribute("userId", RequestAttributes.SCOPE_REQUEST).toString());
        return "Success";
    }
}
