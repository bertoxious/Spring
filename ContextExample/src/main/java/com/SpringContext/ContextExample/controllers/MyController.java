package com.SpringContext.ContextExample.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Moshi Moshi");
        return "Ashu desu";
    }

}
