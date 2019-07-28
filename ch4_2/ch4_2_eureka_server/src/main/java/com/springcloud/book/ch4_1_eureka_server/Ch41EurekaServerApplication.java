package com.springcloud.book.ch4_1_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch41EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch41EurekaServerApplication.class, args);
    }

}
