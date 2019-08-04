package com.springcloud.book.ch6_1_zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulServer
public class Ch61ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch61ZuulServerApplication.class, args);
    }

}
