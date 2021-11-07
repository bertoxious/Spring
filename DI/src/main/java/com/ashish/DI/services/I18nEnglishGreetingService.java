package com.ashish.DI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("en")
@Service("i18nService")
public class I18nEnglishGreetingService implements RandomService{

    @Override
    public String randomServiceMethod() {
        return "Hello my name is Ashish, nice to meet you.";
    }
}
