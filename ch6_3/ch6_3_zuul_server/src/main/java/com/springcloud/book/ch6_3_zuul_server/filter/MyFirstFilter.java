package com.springcloud.book.ch6_3_zuul_server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/7
 * @Time: 22:32
 * @email: inwsy@hotmail.com
 * Description:
 */
public class MyFirstFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(MyFirstFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>这是我们第一个自定义的Filter");
        return null;
    }
}
