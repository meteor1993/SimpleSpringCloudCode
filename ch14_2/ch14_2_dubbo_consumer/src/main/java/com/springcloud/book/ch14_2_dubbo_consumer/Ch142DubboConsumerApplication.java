package com.springcloud.book.ch14_2_dubbo_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch142DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch142DubboConsumerApplication.class, args);
    }

}
