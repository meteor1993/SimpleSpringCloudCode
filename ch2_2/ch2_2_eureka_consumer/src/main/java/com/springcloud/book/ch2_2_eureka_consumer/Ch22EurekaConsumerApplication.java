package com.springcloud.book.ch2_2_eureka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ch22EurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch22EurekaConsumerApplication.class, args);
    }

}
