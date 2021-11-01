package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomService;
import com.ashish.DI.services.RandomServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setAnotherRandomService( new RandomServiceImpl());
    }
    @Test
    void getRandomService() {
        System.out.println(controller.getRandomService());
    }
}