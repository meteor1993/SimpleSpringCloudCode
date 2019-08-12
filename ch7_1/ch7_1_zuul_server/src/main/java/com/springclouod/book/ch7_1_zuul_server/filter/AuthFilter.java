package com.springclouod.book.ch7_1_zuul_server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.springcloud.book.ch7_1_common.util.JWTUtil;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/12
 * @Time: 22:44
 * @email: inwsy@hotmail.com
 * Description:
 */
@Component
public class AuthFilter extends ZuulFilter {
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
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        if (request.getRequestURI().startsWith("/auth")) {
            // 如果是auth服务，当前过滤器不生效
            return false;
        }
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        String token = request.getHeader("Authorization");
        if (StringUtils.isEmpty(token)) {
            // 如果token不存在
            HttpServletResponse response = context.getResponse();
            response.setHeader("Content-Type", "application/json;charset=UTF-8");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            context.setResponse(response);
        } else {
            boolean verifyResult = JWTUtil.verify(token);
            if (!verifyResult) {
                // 如果校验失败
                HttpServletResponse response = context.getResponse();
                response.setHeader("Content-Type", "application/json;charset=UTF-8");
                context.setSendZuulResponse(false);
                context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
                context.setResponse(response);
            }
        }

        return null;
    }
}
