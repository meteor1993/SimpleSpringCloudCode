package com.springcloud.book.ch3_1_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch31EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch31EurekaApplication.class, args);
	}

}
