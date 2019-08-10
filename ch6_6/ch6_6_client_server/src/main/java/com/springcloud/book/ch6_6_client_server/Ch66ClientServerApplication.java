package com.springcloud.book.ch6_6_client_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch66ClientServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch66ClientServerApplication.class, args);
    }

}
