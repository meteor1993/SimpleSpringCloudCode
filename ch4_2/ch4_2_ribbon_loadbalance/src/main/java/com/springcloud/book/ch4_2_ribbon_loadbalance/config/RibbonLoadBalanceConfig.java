package com.springcloud.book.ch4_2_ribbon_loadbalance.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/7/28
 * @Time: 18:51
 * @email: inwsy@hotmail.com
 * Description:
 */
//@Configuration
//@AvoidScan
public class RibbonLoadBalanceConfig {

    @Autowired
    IClientConfig config;

    /**
     * 随机策略
     * @return
     */
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }
}
