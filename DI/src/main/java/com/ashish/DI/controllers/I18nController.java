package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final RandomService randomService;

    public I18nController(@Qualifier("i18nService")  RandomService randomService) {
        this.randomService = randomService;
    }
    public String sayGreeting(){
        return randomService.randomServiceMethod();
    }
}
