package com.springcloud.book.ch11_2_zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Ch112ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch112ZuulServerApplication.class, args);
    }

}
