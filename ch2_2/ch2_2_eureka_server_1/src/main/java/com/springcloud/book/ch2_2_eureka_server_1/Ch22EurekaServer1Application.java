package com.springcloud.book.ch2_2_eureka_server_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch22EurekaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch22EurekaServer1Application.class, args);
    }

}
