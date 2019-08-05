package com.springcloud.book.ch6_2_zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Ch62ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch62ZuulServerApplication.class, args);
    }

}
