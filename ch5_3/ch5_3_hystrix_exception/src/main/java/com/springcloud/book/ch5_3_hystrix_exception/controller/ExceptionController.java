package com.springcloud.book.ch5_3_hystrix_exception.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.book.ch5_3_hystrix_exception.service.FallbackBadRequestExpcetion;
import com.springcloud.book.ch5_3_hystrix_exception.service.FallbackOtherExpcetion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/8/2 13:49
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class ExceptionController {

    private static Logger log = LoggerFactory.getLogger(ExceptionController.class);

    @GetMapping("/getFallbackBadRequestExpcetion")
    public String providerServiceFallback(){
        String result = new FallbackBadRequestExpcetion().execute();
        return result;
    }


    @GetMapping("/getFallbackOtherExpcetion")
    public String pSFallbackOtherExpcetion(){
        String result = new FallbackOtherExpcetion().execute();
        return result;
    }

    @GetMapping("/getFallbackMethodTest")
    @HystrixCommand
    public String getFallbackMethodTest(){
        throw new RuntimeException("getFallbackMethodTest failed");
    }

    public String fallback(String id, Throwable throwable) {
        log.error(throwable.getMessage());
        return "this is fallback message";
    }
}
