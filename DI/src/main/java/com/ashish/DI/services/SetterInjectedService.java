package com.ashish.DI.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements RandomService{
    @Override
    public String randomServiceMethod(){
        return "Service Injected -> \n Greeting Service";
    }
}
