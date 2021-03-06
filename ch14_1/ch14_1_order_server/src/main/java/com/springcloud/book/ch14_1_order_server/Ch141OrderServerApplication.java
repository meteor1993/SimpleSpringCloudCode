package com.springcloud.book.ch14_1_order_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch141OrderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch141OrderServerApplication.class, args);
    }

}
