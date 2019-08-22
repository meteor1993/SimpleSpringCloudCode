package com.springcloud.book.ch10_2_provider_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch102ProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch102ProviderServiceApplication.class, args);
    }

}
