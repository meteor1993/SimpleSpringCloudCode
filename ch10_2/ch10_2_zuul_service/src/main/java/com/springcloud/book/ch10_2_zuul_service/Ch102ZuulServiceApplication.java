package com.springcloud.book.ch10_2_zuul_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Ch102ZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch102ZuulServiceApplication.class, args);
    }

}
