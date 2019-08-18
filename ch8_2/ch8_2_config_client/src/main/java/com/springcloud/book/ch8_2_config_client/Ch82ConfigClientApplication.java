package com.springcloud.book.ch8_2_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch82ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch82ConfigClientApplication.class, args);
    }

}
