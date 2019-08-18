package com.springcloud.book.ch8_3_config_server_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ch83ConfigServerMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch83ConfigServerMysqlApplication.class, args);
    }

}
