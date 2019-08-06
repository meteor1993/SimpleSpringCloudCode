package com.springcloud.book.ch3_2_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch32EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch32EurekaApplication.class, args);
	}

}
