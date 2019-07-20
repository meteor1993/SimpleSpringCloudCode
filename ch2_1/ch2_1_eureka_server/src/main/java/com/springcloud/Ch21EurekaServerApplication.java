package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/7/20
 * @Time: 22:13
 * @email: inwsy@hotmail.com
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch21EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch21EurekaServerApplication.class, args);
    }
}
