package com.springcloud.book.ch3_2_feign_param_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch32FeignParamProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch32FeignParamProviderApplication.class, args);
	}

}
