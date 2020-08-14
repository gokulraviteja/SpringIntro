package com.grt.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/health-check")
    public  String healthCheck(){
        return "Success";
    }

}
