package com.springcloud.book.ch8_4_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch84EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch84EurekaServerApplication.class, args);
    }

}
