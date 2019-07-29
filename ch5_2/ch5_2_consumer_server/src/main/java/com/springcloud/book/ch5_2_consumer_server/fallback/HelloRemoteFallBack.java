package com.springcloud.book.ch5_2_consumer_server.fallback;

import com.springcloud.book.ch5_2_consumer_server.remote.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/7/29
 * @Time: 23:42
 * @email: inwsy@hotmail.com
 * Description:
 */
@Component
public class HelloRemoteFallBack implements HelloRemote {
    @Override
    public String hello(String name) {
        return "Hello " + name + ", i am fallback massage";
    }
}
