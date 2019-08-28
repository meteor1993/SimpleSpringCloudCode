package com.springcloud.book.ch11_2_zuul_server.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.netflix.zuul.RoutesRefreshedEvent;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/20
 * @Time: 22:44
 * @email: inwsy@hotmail.com
 * Description:
 */
@Configuration
public class ZuulProxyRefresher implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(ZuulProxyRefresher.class);

    private ApplicationContext applicationContext;

    @Autowired
    private RouteLocator routeLocator;

    @NacosConfigListener(dataId = "zuul-config-dev.yml")
    public void onChange(Properties value) {
        logger.info("onReceived(Properties) : {}", value);
//        boolean zuulProxyChanged = false;
//        for (String changedKey : changeEvent.changedKeys()) {
//            if (changedKey.startsWith("zuul.")) {
//                zuulProxyChanged = true;
//                break;
//            }
//        }
//        if (zuulProxyChanged) {
//            refreshZuulProxy(changeEvent);
//        }
    }

//    private void refreshZuulProxy(ConfigChangeEvent changeEvent) {
//        this.applicationContext.publishEvent(new EnvironmentChangeEvent(changeEvent.changedKeys()));
//        this.applicationContext.publishEvent(new RoutesRefreshedEvent(routeLocator));
//    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
