package com.springcloud.book.ch4_1_ribbon_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch41RibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch41RibbonClientApplication.class, args);
    }

}
