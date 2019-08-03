package com.springcloud.book.ch5_3_hystrix_cache.service;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;

public interface HelloService {
    String hello(String name);
    String getUserToCommandKey(@CacheKey String name);
    String updateUser(@CacheKey String name);
}
