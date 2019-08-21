package com.springcloud.book.ch10_1_sleuth_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch101SleuthConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch101SleuthConsumerApplication.class, args);
    }

}
