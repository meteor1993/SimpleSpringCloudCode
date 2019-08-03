package com.springcloud.book.ch5_3_hystrix_cache.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixRequestCache;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategyDefault;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/3
 * @Time: 15:39
 * @email: inwsy@hotmail.com
 * Description:
 */
public class HelloCommand extends HystrixCommand<String> {

    private RestTemplate restTemplate;
    private String name;

    public HelloCommand(RestTemplate restTemplate, String name) {
        super(HystrixCommandGroupKey.Factory.asKey("springCloudCacheGroup"));
        this.name = name;
        this.restTemplate = restTemplate;
    }

    @Override
    protected String getFallback() {
        return "fallback";
    }

    @Override
    protected String run() throws Exception {
        String json = restTemplate.getForObject("http://spring-cloud-provider-server/hello?name={name}", String.class, name);
        System.out.println(json);
        return json;
    }

    @Override
    protected String getCacheKey() {
        return String.valueOf(name);
    }

    public static void cleanCache(Long id){
        HystrixRequestCache.getInstance(HystrixCommandKey.Factory.asKey("springCloudCacheGroup"), HystrixConcurrencyStrategyDefault.getInstance()).clear(String.valueOf(id));
    }
}
