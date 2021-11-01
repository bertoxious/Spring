package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;

public class ConstructorInjectedController {
    private final RandomService randomService;

    public ConstructorInjectedController(RandomService randomService) {
        this.randomService = randomService;
    }

    public String getRandomService(){
        return randomService.randomServiceMethod();
    }
}
