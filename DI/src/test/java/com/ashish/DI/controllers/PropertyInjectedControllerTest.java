package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.randomService = new RandomServiceImpl();

    }
    @Test
    void getGreeting(){
        System.out.println(controller.randomServiceMethod());
    }

}