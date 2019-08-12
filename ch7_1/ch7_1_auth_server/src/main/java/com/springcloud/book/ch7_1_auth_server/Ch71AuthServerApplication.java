package com.springcloud.book.ch7_1_auth_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ch71AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch71AuthServerApplication.class, args);
    }

}
