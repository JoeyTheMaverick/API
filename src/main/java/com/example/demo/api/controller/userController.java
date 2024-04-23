package com.example.demo.api.controller;

import com.example.demo.api.model.User;
import com.example.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class userController {

    private userService userservice;

    @Autowired
    public userController(userService userservice){
        this.userservice = userservice;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        Optional user = userservice.getUser(id);
        if(user.isPresent()){
            return (User) user.get();
        }
        return null;
    }
}
