package com.springcloud.book.ch3_2_feign_filedownload_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch32FeignFiledownloadClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch32FeignFiledownloadClientApplication.class, args);
	}

}
