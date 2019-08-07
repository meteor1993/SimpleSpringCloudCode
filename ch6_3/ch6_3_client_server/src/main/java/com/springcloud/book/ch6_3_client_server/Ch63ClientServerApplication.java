package com.springcloud.book.ch6_3_client_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch63ClientServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch63ClientServerApplication.class, args);
    }

}
