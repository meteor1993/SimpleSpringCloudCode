package com.springcloud.book.ch15_2_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch152EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch152EurekaServerApplication.class, args);
    }

}
