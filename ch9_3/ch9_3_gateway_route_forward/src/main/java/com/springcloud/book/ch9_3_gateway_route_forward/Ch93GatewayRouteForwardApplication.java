package com.springcloud.book.ch9_3_gateway_route_forward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ch93GatewayRouteForwardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch93GatewayRouteForwardApplication.class, args);
	}

//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
//		return builder.routes()
//				.route("path_route", r -> r.path("/dxy3377")
//						.uri("https://github.com"))
//				.build();
//	}


}
