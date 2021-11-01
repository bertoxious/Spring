package com.ashish.DI.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("sn")
@Service("i18nService")
public class I18nSpanigshGreetingService implements RandomService{
    @Override
    public String randomServiceMethod() {
        return "Holya soy Ashish Muchos Gustos";
    }
}
