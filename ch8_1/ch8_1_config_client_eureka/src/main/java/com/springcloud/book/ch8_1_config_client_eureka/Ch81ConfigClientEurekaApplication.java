package com.springcloud.book.ch8_1_config_client_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch81ConfigClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch81ConfigClientEurekaApplication.class, args);
    }

}
