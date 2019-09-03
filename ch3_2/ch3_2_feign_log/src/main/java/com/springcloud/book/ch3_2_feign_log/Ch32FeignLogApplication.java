package com.springcloud.book.ch3_2_feign_log;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class Ch32FeignLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch32FeignLogApplication.class, args);
	}

}
