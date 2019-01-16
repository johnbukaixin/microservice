package com.ptl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * create by panta on 2017/10/23
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient 服务发现组件用下面这个也可以，上面的是高度抽象，zookeeper的服务发现组件也可以
public class ProviderUserApplication {

    public static void main(String[] args){
        SpringApplication.run(ProviderUserApplication.class,args);
    }
}
