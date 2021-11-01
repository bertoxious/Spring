package com.ashish.DI;

import com.ashish.DI.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.yaml.snakeyaml.introspector.Property;

import java.util.concurrent.ConcurrentSkipListMap;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		System.out.println("Primary Bean");
		System.out.println(controller.Controller());

		System.out.println("-- Property Based");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.randomServiceMethod());


		System.out.println("-- Setter Based");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getRandomService());

		System.out.println("-- Constructor Based");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getRandomService());


	}

}
