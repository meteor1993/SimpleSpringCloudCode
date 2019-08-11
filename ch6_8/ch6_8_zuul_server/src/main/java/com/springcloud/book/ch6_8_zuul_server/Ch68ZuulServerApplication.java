package com.springcloud.book.ch6_8_zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Ch68ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch68ZuulServerApplication.class, args);
    }

}
