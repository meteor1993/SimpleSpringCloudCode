package com.springcloud.book.ch8_1_config_server_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Ch81ConfigServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch81ConfigServerEurekaApplication.class, args);
    }

}
