package com.springcloud.book.ch10_4_eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch104EurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch104EurekaServiceApplication.class, args);
    }

}
