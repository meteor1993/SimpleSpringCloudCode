package com.springcloud.book.ch5_3_hystrix_thread.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/4
 * @Time: 19:27
 * @email: inwsy@hotmail.com
 * Description:
 */
public class HystrixThreadContextConfiguration {
    @Bean
    public SpringCloudHystrixConcurrencyStrategy springCloudHystrixConcurrencyStrategy() {
        return new SpringCloudHystrixConcurrencyStrategy();
    }
}
