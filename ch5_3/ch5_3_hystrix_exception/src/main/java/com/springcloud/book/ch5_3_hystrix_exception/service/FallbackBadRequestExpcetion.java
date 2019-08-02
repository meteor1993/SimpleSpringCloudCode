package com.springcloud.book.ch5_3_hystrix_exception.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Date: 2019/8/2 10:41
 * @Version: 1.0
 * @Desc:
 */
public class FallbackBadRequestExpcetion extends HystrixCommand<String> {

    private static Logger log = LoggerFactory.getLogger(FallbackBadRequestExpcetion.class);

    public FallbackBadRequestExpcetion() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupBadRequestExpcetion"));
    }

    @Override
    protected String run() {
        throw new HystrixBadRequestException("HystrixBadRequestException error");
    }

    @Override
    protected String getFallback() {
        log.error(getFailedExecutionException().getMessage());
        return "invoke HystrixBadRequestException fallback method:  ";
    }
}
