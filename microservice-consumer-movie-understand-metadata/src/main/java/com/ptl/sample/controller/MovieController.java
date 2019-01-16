package com.ptl.sample.controller;

import com.ptl.sample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * create by panta on 2017/9/13
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:8080/user/"+id,User.class);
    }

    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo(){
        return this.discoveryClient.getInstances("microservice-provider-user-register");
    }
}
