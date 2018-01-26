package com.sam.springmvcselftry.controller;


import com.sam.springmvcselftry.repository.Userrepository;
import com.sam.springmvcselftry.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Userrepository userrepository;


    @GetMapping(value = "/all")
    public List<User> getall(){
        return userrepository.findAll();

    }

    @GetMapping(value = "/{name}")
    public User findOneUser(@PathVariable final String name){
        return userrepository.findByName(name);

    }

    @PostMapping(value = "/add")
    public User adduser(@RequestBody final User user){
        userrepository.save(user);
        return userrepository.findByName(user.getName());
    }
}
