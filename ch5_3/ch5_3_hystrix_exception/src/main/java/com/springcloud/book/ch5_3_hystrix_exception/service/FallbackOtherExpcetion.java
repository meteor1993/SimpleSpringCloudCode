package com.springcloud.book.ch5_3_hystrix_exception.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Date: 2019/8/2 10:48
 * @Version: 1.0
 * @Desc:
 */
public class FallbackOtherExpcetion extends HystrixCommand<String> {

    private static Logger log = LoggerFactory.getLogger(FallbackOtherExpcetion.class);

    public FallbackOtherExpcetion() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupOtherExpcetion"));
    }

    @Override
    protected String run() throws Exception {
        throw  new Exception("This is other exception");
    }

    @Override
    protected String getFallback() {
        return "invoke FallbackOtherExpcetion fallback method";
    }
}
