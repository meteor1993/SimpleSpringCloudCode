package com.springcloud.book.ch9_3_gateway_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch93GatewayProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch93GatewayProviderApplication.class, args);
	}

}
