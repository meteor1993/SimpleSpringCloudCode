package com.springcloud.book.ch10_4_consumer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ch104ConsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch104ConsumerServiceApplication.class, args);
    }

}
