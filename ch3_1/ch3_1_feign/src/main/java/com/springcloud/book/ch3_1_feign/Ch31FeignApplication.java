package com.springcloud.book.ch3_1_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch31FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch31FeignApplication.class, args);
	}

}
