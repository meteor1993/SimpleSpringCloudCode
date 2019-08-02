package com.springcloud.book.ch3_2_feign_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch32FeignConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch32FeignConfigApplication.class, args);
	}

}
