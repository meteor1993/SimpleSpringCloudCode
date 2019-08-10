package com.springcloud.book.ch6_7_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch67EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch67EurekaServerApplication.class, args);
    }

}
