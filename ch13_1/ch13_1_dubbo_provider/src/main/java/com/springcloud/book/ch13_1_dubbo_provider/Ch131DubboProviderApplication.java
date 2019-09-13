package com.springcloud.book.ch13_1_dubbo_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch131DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch131DubboProviderApplication.class, args);
    }

}
