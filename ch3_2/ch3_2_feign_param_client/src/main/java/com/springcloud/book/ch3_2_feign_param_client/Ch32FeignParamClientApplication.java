package com.springcloud.book.ch3_2_feign_param_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch32FeignParamClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch32FeignParamClientApplication.class, args);
	}

}
