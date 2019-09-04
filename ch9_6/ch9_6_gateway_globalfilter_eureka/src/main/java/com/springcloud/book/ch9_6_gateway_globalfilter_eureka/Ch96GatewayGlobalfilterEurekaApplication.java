package com.springcloud.book.ch9_6_gateway_globalfilter_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch96GatewayGlobalfilterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch96GatewayGlobalfilterEurekaApplication.class, args);
	}

}
