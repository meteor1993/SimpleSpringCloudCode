package com.springcloud.book.ch7_1_data_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class Ch71DataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch71DataServiceApplication.class, args);
    }

}
