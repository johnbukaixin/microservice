package com.ptl.sample.controller;

import com.ptl.sample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * create by panta on 2017/9/13
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


//    @Bean //使用此注解初始化bean
//    @LoadBalanced //加上loadBalanced 使用负载均衡均衡
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }

    /**
     * 这个地方在使用负载均衡调用的时候会出现org.springframework.web.client.HttpClientErrorException: 404 null 错误。？？？？
     * @param id
     * @return
     */
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://microservice-provider-user-register/" + id, User.class);
    }

    @GetMapping("instance")
    public void logUserInstance(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user-register");
        System.out.println(serviceInstance.getServiceId() + ":" + serviceInstance.getPort() + ":" + serviceInstance.getHost());
    }
}
