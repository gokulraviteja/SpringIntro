package com.grt.controllers;

import com.grt.models.Merchant;
import com.grt.repos.MerchantRepo;
import com.grt.repos.UserRepo;
import com.grt.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;


    @RequestMapping("/users")
    public List<User> getAllUsers(){
        List<User> list = new ArrayList<>();
        userRepo.findAll().forEach(t-> list.add(t));
        return list;
    }

    @RequestMapping("/user/{id}")
    public  User getUser(@PathVariable int id){
        return userRepo.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/user/register")
    public  String  registerUser(@RequestBody User user){
        userRepo.save(user);
        return  "User Created";
    }



}
