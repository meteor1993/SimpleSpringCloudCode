package com.springcloud.book.ch6_1_client_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch61ClientServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch61ClientServerApplication.class, args);
    }

}
