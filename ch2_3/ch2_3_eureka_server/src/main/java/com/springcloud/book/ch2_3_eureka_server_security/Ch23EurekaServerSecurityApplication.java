package com.springcloud.book.ch2_3_eureka_server_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch23EurekaServerSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch23EurekaServerSecurityApplication.class, args);
    }

}
