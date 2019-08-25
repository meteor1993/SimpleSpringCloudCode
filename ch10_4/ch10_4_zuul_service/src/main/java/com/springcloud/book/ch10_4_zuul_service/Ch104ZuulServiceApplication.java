package com.springcloud.book.ch10_4_zuul_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Ch104ZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch104ZuulServiceApplication.class, args);
    }

}
