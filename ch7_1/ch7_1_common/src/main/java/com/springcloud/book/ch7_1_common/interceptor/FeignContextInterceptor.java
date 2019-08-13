package com.springcloud.book.ch7_1_common.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/14
 * @Time: 0:01
 * @email: inwsy@hotmail.com
 * Description: Feign传递认证的上下文
 */
public class FeignContextInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        requestTemplate.header("x-customs-Authorization", request.getHeader("x-customs-Authorization"));
    }
}
