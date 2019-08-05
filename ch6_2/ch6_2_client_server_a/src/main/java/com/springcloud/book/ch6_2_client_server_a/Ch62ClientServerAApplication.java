package com.springcloud.book.ch6_2_client_server_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch62ClientServerAApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch62ClientServerAApplication.class, args);
    }

}
