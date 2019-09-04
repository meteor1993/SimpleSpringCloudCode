package com.springcloud.book.ch9_6_gateway_globalfilter_loadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch96GatewayGlobalfilterLoadbalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch96GatewayGlobalfilterLoadbalancerApplication.class, args);
	}

}
