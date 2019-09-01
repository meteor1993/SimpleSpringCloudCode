package com.springcloud.book.ch12_2_zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Ch122ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch122ZuulServerApplication.class, args);
    }

}
