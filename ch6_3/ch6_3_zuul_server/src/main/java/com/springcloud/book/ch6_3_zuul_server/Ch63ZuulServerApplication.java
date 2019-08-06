package com.springcloud.book.ch6_3_zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Ch63ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch63ZuulServerApplication.class, args);
    }

}
