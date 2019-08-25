package com.springcloud.book.ch10_4_provider_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch104ProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch104ProviderServiceApplication.class, args);
    }

}
