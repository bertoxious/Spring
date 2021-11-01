package com.ashish.DI.controllers;

import com.ashish.DI.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.randomService = new ConstructorGreetingService();

    }
    @Test
    void getGreeting(){
        System.out.println(controller.randomServiceMethod());
    }

}