package com.springcloud.book.ch4_2_ribbon_loadbalance;

import com.springcloud.book.ch4_2_ribbon_loadbalance.config.AvoidScan;
import com.springcloud.book.ch4_2_ribbon_loadbalance.config.RibbonLoadBalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClients(value = {
        @RibbonClient(name = "spring-cloud-client", configuration = RibbonLoadBalanceConfig.class)
})
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {AvoidScan.class})})
public class Ch42RibbonLoadbalanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch42RibbonLoadbalanceApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
