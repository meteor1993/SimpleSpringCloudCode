package com.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/7/21
 * @Time: 0:37
 * @email: inwsy@hotmail.com
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch21EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch21EurekaClientApplication.class, args);
    }
}
