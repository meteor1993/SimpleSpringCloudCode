package com.springcloud.book.ch6_3_zuul_server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/7
 * @Time: 23:53
 * @email: inwsy@hotmail.com
 * Description:
 */
public class PostFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(PostFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
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
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>这是PostFilter");
        // 从RequestContext获取上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        // 处理返回中文乱码
        ctx.getResponse().setCharacterEncoding("UTF-8");
        // 获取上下文中保存的responseBody
        String responseBody = ctx.getResponseBody();
        // 如果responseBody不为空，则说明流程有异常发生
        if (null != responseBody) {
            // 设定返回状态码
            ctx.setResponseStatusCode(500);
            // 替换响应报文
            ctx.setResponseBody(responseBody);
        }
        return null;
    }
}
