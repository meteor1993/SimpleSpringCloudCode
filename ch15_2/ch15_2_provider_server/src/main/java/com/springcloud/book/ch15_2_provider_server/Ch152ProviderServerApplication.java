package com.springcloud.book.ch15_2_provider_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch152ProviderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch152ProviderServerApplication.class, args);
    }

}
