package com.springcloud.book.ch6_3_zuul_server;

import com.springcloud.book.ch6_3_zuul_server.filter.FirstPreFilter;
import com.springcloud.book.ch6_3_zuul_server.filter.MyFirstFilter;
import com.springcloud.book.ch6_3_zuul_server.filter.PostFilter;
import com.springcloud.book.ch6_3_zuul_server.filter.SecondPreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class Ch63ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch63ZuulServerApplication.class, args);
    }

    @Bean
    public MyFirstFilter myFirstFilter() {
        return new MyFirstFilter();
    }

    @Bean
    public FirstPreFilter firstPreFilter() {
        return new FirstPreFilter();
    }

    @Bean
    public SecondPreFilter secondPreFilter() {
        return new SecondPreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

}
