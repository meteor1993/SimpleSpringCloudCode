package com.springcloud.book.ch12_2_provider_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch122ProviderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch122ProviderServerApplication.class, args);
    }

}
