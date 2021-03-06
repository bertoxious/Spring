package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final RandomService randomService;

    public ConstructorInjectedController(RandomService randomService) {
        this.randomService = randomService;
    }

    public String getRandomService(){
        return randomService.randomServiceMethod();
    }
}
