package com.ptl.sample.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon配置类，此配置类不应该包含在主程序的上下文的componentScan中，需要在主程序中排除
 * create by panta on 2017/11/5
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
