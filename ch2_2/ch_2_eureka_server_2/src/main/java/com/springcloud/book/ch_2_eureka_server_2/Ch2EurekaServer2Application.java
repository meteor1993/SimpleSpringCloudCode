package com.springcloud.book.ch_2_eureka_server_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch2EurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch2EurekaServer2Application.class, args);
    }

}
