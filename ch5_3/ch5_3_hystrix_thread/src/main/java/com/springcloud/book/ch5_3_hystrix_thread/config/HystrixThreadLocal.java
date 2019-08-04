package com.springcloud.book.ch5_3_hystrix_thread.config;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/4
 * @Time: 19:26
 * @email: inwsy@hotmail.com
 * Description:
 */
public class HystrixThreadLocal {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();
}
