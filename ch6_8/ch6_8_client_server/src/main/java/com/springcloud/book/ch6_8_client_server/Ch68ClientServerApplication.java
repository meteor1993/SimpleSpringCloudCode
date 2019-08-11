package com.springcloud.book.ch6_8_client_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch68ClientServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch68ClientServerApplication.class, args);
    }

}
