package com.ashish.DI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements RandomService{
    @Override
    public String randomServiceMethod() {
        return "Uzumaki from the primary bean";
    }
}
