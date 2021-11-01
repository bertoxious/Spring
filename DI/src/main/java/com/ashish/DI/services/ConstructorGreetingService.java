package com.ashish.DI.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements RandomService {
    @Override
    public String randomServiceMethod() {
        return "Random service method -> \n Constructor greeting service";
    }
}
