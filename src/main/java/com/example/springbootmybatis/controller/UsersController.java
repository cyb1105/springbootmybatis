package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.Users;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public List<Users> getAllUsers(){
        List<Users> list = service.getAllUsers();

        return list;
    }

    @GetMapping("/users/{id}")
    public  Users getUserById(@PathVariable String id){
        Users user = service.getUserById(id);
        if(user == null){
            //throw
        }
        return user;
    }

    @PostMapping("/users")
    public int createUser(@RequestBody Users user){
        int createUser = service.createUser(user);
        return createUser;
    }
}
