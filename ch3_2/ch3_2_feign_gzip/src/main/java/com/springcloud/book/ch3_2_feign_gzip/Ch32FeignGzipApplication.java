package com.springcloud.book.ch3_2_feign_gzip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch32FeignGzipApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch32FeignGzipApplication.class, args);
	}

}
