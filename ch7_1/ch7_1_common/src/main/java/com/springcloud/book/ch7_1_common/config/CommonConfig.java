package com.springcloud.book.ch7_1_common.config;

import com.springcloud.book.ch7_1_common.context.SpringCloudHystrixConcurrencyStrategy;
import com.springcloud.book.ch7_1_common.interceptor.FeignContextInterceptor;
import com.springcloud.book.ch7_1_common.interceptor.UserContextInterceptor;
import feign.Feign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/13
 * @Time: 22:18
 * @email: inwsy@hotmail.com
 * Description:
 */
@Configuration
public class CommonConfig implements WebMvcConfigurer {

    /**
     * 请求拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserContextInterceptor()).addPathPatterns("/api/**");
    }

    /**
     * 创建Feign请求拦截器，在发送请求前设置认证的上下文信息
     */
    @Bean
    @ConditionalOnClass(Feign.class)
    public FeignContextInterceptor feignTokenInterceptor() {
        return new FeignContextInterceptor();
    }

    @Bean
    public SpringCloudHystrixConcurrencyStrategy springCloudHystrixConcurrencyStrategy() {
        return new SpringCloudHystrixConcurrencyStrategy();
    }
}
