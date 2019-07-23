package com.springcloud.book.ch2_2_eureka_client_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch22EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch22EurekaClient1Application.class, args);
    }

}
