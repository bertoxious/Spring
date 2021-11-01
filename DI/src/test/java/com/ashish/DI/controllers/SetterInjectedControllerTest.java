package com.ashish.DI.controllers;

import com.ashish.DI.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setAnotherRandomService( new ConstructorGreetingService());
    }
    @Test
    void getRandomService() {
        System.out.println(controller.getRandomService());
    }
}