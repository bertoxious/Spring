package com.ashish.DI.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String Controller(){
        System.out.println("I am the method inside Controller");
        return "Hi, returning from Controller";
    }
}
