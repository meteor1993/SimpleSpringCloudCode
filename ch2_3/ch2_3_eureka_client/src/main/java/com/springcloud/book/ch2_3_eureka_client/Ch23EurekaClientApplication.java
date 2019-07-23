package com.springcloud.book.ch2_3_eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch23EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch23EurekaClientApplication.class, args);
    }

}
