package com.springcloud.book.ch5_2_provider_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class Ch53ProviderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch53ProviderServerApplication.class, args);
    }

}
