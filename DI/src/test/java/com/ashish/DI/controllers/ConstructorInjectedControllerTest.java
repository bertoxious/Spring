package com.ashish.DI.controllers;

import com.ashish.DI.services.RandomServiceImpl;
import com.sun.tools.jconsole.JConsoleContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new RandomServiceImpl());

    }

    @Test
    void getRandomService() {
        System.out.println(controller.getRandomService());
    }
}