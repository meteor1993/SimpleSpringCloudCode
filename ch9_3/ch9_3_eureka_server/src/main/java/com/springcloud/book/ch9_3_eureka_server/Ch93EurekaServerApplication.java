package com.springcloud.book.ch9_3_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch93EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch93EurekaServerApplication.class, args);
	}

}
