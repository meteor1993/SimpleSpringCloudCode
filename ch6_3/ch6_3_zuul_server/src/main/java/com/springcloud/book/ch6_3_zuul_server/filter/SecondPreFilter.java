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
public class SecondPreFilter extends ZuulFilter{

    private final Logger logger = LoggerFactory.getLogger(SecondPreFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 设置优先级
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        // 从上下文获取标记位的值，用于判断此Filter是否执行
        return (boolean)ctx.get("success-flag");
    }

    @Override
    public Object run() throws ZuulException {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>这是SecondPreFilter");
        // 从RequestContext获取上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        // 从上下文获取HttpServletRequest
        HttpServletRequest request = ctx.getRequest();
        // 从request尝试获取参数b
        String b = request.getParameter("b");
        // 如果参数b为空则进入此逻辑
        if (null == b) {
            //对该请求禁止路由，也就是禁止访问下游服务
            ctx.setSendZuulResponse(false);
            //设定responseBody供PostFilter使用
            ctx.setResponseBody("{\"status\":500,\"message\":\"参数b为空！\"}");
            // 上下文保存标记位，作为同类型下游Filter的执行开关，假定后续还有自定义Filter当设置此值
            ctx.set("success-flag", false);
            //到这里此Filter逻辑结束
            return null;
        }
        return null;
    }
}
