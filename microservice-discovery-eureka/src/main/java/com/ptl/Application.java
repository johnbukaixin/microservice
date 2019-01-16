package com.ptl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * create by panta on 2017/10/16
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String args[]){
        SpringApplication.run(Application.class,args);
    }
}
