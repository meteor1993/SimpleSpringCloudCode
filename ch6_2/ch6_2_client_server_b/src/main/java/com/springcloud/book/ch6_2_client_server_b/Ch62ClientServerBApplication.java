package com.springcloud.book.ch6_2_client_server_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch62ClientServerBApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch62ClientServerBApplication.class, args);
    }

}
