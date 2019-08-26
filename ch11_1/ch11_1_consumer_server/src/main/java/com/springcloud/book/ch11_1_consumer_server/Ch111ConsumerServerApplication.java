package com.springcloud.book.ch11_1_consumer_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Ch111ConsumerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch111ConsumerServerApplication.class, args);
    }

}
