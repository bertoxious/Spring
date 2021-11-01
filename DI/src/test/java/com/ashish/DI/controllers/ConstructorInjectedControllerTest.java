package com.ashish.DI.controllers;

import com.ashish.DI.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());

    }

    @Test
    void getRandomService() {
        System.out.println(controller.getRandomService());
    }
}