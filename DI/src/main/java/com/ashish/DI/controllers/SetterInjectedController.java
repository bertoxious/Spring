package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;

public class SetterInjectedController {

    private RandomService anotherRandomService;

    public void setAnotherRandomService(RandomService anotherRandomService) {
        this.anotherRandomService = anotherRandomService;
    }

    public String getRandomService(){
        return anotherRandomService.randomServiceMethod();
    }
}
