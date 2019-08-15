package com.springcloud.book.ch8_1_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ch81ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch81ConfigServerApplication.class, args);
    }

}
