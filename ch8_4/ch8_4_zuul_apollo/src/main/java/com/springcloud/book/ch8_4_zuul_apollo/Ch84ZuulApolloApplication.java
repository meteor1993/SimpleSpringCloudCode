package com.springcloud.book.ch8_4_zuul_apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableApolloConfig
public class Ch84ZuulApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch84ZuulApolloApplication.class, args);
    }

}
