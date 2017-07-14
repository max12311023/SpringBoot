package com.user.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController  
@RequestMapping("/user")
@EnableAutoConfiguration
public class UserController {  
  
    @RequestMapping("/{id}")  
    public User view(@PathVariable("id") Long id) {  
        User user = new User();  
        user.setId(id);  
        user.setName("zhang");  
        return user;  
    }  
  
    //public static void main(String[] args) {  
    //    SpringApplication.run(UserController.class);  
    //}  
  
}  