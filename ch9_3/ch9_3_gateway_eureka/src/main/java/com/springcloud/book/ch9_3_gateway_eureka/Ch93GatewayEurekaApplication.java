package com.springcloud.book.ch9_3_gateway_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch93GatewayEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch93GatewayEurekaApplication.class, args);
	}

}
