package com.springcloud.book.ch5_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class Ch51Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch51Application.class, args);
    }

}
