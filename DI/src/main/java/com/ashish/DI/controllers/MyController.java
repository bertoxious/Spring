package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final RandomService randomService;

    public MyController(RandomService randomService) {
        this.randomService = randomService;
    }

    public String Controller(){
        return randomService.randomServiceMethod();
    }
}
