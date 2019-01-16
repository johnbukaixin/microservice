package com.ptl.sample.controller;

import com.ptl.sample.dao.UserRepository;
import com.ptl.sample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }
}
