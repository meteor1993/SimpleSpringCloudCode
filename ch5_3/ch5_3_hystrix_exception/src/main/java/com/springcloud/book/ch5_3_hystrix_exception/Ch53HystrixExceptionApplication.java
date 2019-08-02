package com.springcloud.book.ch5_3_hystrix_exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
public class Ch53HystrixExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch53HystrixExceptionApplication.class, args);
    }

}
