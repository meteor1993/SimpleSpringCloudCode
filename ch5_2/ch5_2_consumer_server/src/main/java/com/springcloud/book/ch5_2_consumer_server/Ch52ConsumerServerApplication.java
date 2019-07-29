package com.springcloud.book.ch5_2_consumer_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ch52ConsumerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch52ConsumerServerApplication.class, args);
    }

}
