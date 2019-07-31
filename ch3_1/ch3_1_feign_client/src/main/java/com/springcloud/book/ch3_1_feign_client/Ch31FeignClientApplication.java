package com.springcloud.book.ch3_1_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Ch31FeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch31FeignClientApplication.class, args);
	}

}
