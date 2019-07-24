package com.springcloud.book.ch4_2_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch42ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch42ClientApplication.class, args);
    }

}
