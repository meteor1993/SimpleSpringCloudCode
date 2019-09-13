package com.springcloud.book.ch13_2_dubbo_provider_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch132DubboProviderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch132DubboProviderWebApplication.class, args);
    }

}
