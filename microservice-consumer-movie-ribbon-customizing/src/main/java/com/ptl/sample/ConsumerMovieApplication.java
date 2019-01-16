package com.ptl.sample;

import com.ptl.sample.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * create by panta on 2017/9/13
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class, RibbonConfiguration.class})
@EnableDiscoveryClient
public class ConsumerMovieApplication {
    @Bean //使用此注解初始化bean
    @LoadBalanced //加上loadBalanced 使用负载均衡均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args){
        SpringApplication.run(ConsumerMovieApplication.class,args);
    }
}
