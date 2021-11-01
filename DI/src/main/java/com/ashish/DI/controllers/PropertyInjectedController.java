package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;
import com.ashish.DI.services.RandomServiceImpl;

public class PropertyInjectedController {
    public RandomService randomService;

    public String randomServiceMethod(){
        return randomService.randomServiceMethod();
    }
}
