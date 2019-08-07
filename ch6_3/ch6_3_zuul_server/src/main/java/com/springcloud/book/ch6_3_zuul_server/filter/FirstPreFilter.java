package com.springcloud.book.ch6_3_zuul_server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/7
 * @Time: 23:53
 * @email: inwsy@hotmail.com
 * Description:
 */
public class FirstPreFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(FirstPreFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 设置优先级，需要比SecondPreFilter优先级更高
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>这是FirstPreFilter");
        // 从RequestContext获取上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        // 从上下文获取HttpServletRequest
        HttpServletRequest request = ctx.getRequest();
        // 从request尝试获取参数a
        String a = request.getParameter("a");
        // 如果参数a为空则进入此逻辑
        if (null == a) {
            // 对该请求禁止路由，也就是禁止访问下游服务
            ctx.setSendZuulResponse(false);
            // 设定responseBody供PostFilter使用
            ctx.setResponseBody("{\"status\":500,\"message\":\"参数a为空\"}");
            // 上下文保存标记位，作为同类型下游Filter的执行开关
            ctx.set("success-flag", false);
            // 到这里此Filter逻辑结束
            return null;
        }
        // 设置上下文标记位，避免报空
        ctx.set("success-flag", true);
        return null;
    }
}
