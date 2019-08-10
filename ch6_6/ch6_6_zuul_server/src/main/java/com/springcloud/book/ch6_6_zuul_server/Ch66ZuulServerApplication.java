package com.springcloud.book.ch6_6_zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Ch66ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch66ZuulServerApplication.class, args);
    }

}
