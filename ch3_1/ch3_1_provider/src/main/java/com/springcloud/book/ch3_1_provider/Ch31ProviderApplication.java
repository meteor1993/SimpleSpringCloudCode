package com.springcloud.book.ch3_1_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch31ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch31ProviderApplication.class, args);
	}

}
