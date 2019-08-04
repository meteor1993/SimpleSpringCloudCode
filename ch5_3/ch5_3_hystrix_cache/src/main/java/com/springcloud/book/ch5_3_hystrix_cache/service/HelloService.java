package com.springcloud.book.ch5_3_hystrix_cache.service;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;

public interface HelloService {
    String hello(@CacheKey String name);
    String helloCommandKey(@CacheKey String name);
    String updateHello(@CacheKey String name);
}
