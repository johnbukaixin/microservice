package com.ptl.sample.controller;

import com.ptl.sample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * create by panta on 2017/9/13
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:8080/user/"+id,User.class);
    }
}
