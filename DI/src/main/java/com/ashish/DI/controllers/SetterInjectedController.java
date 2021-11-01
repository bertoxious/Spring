package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private RandomService anotherRandomService;
    @Qualifier("setterInjectedService")
    @Autowired
    public void setAnotherRandomService(RandomService anotherRandomService) {
        this.anotherRandomService = anotherRandomService;
    }

    public String getRandomService(){
        return anotherRandomService.randomServiceMethod();
    }
}
