package com.springcloud.book.ch5_3_hystrix_collapsing.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/3
 * @Time: 15:22
 * @email: inwsy@hotmail.com
 * Description:
 */
@Configuration
public class HystrixCacheConfiguration {
    @Bean
    @ConditionalOnClass(Controller.class)
    public HystrixCacheContextInterceptor hystrixCacheContextInterceptor() {
        return new HystrixCacheContextInterceptor();
    }

    @Configuration
    @ConditionalOnClass(Controller.class)
    public class WebMvcConfig implements WebMvcConfigurer {

        @Autowired
        HystrixCacheContextInterceptor hystrixCacheContextInterceptor;

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(hystrixCacheContextInterceptor);
        }
    }
}
