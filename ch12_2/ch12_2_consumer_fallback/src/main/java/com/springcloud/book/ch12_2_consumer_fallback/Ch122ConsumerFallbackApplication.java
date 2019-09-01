package com.springcloud.book.ch12_2_consumer_fallback;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.springcloud.book.ch12_2_consumer_fallback.utils.ExceptionUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Ch122ConsumerFallbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch122ConsumerFallbackApplication.class, args);
    }

    @Bean
    @LoadBalanced
    @SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = ExceptionUtil.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
