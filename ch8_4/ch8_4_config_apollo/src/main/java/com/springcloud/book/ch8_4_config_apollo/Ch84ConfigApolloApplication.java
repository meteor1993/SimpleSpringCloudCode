package com.springcloud.book.ch8_4_config_apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig
public class Ch84ConfigApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch84ConfigApolloApplication.class, args);
    }

}
