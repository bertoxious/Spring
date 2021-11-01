package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedService")
    @Autowired
    public RandomService randomService;

    public String randomServiceMethod(){
        return randomService.randomServiceMethod();
    }
}
