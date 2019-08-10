package com.springcloud.book.ch6_6_zuul_server.config;

import com.springcloud.book.ch6_6_zuul_server.locator.DynamicZuulRouteLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/11
 * @Time: 0:05
 * @email: inwsy@hotmail.com
 * Description:
 */
@Configuration
public class DynamicZuulRouteConfig {

    @Autowired
    private ZuulProperties zuulProperties;

    @Autowired
    protected ServerProperties server;

    @Bean
    public DynamicZuulRouteLocator routeLocator() {
        DynamicZuulRouteLocator routeLocator = new DynamicZuulRouteLocator(
                this.server.getServlet().getContextPath(), zuulProperties);
        return routeLocator;
    }
}
