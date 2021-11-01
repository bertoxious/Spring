package com.ashish.DI.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements RandomService{
    @Override
    public String randomServiceMethod(){
        return "Property Injected -> \n Greeting Service";
    }
}
