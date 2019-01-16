package com.ptl.sample.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient注解为特定name的ribbonClient 指定配置类的bean
 * 使用ribbonClient的configuration属性指定Ribbon的配置类
 * create by panta on 2017/11/5
 */
@Configuration
@RibbonClient(configuration = RibbonConfiguration.class,name = "microservice-provider-user-register")
public class TestConfiguration {

}
