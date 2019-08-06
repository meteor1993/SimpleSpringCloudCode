package com.springcloud.book.ch3_2_feign_log.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: daixueyun
 * @Description:
 * @Date: Create in 23:56 2019/8/3
 */
@Configuration
public class HelloServiceConfig {

    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }

}
