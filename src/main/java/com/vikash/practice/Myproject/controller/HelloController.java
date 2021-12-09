package com.vikash.practice.Myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/")
    public  String myname(){
        return "Hello vikash welcome to gainsight!";
    }
}
