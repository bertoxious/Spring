package com.SpringContext.ContextExample;

import com.SpringContext.ContextExample.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ContextExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ContextExampleApplication.class, args);
		MyController myController = (MyController) ac.getBean("myController");
		String greetings = myController.sayHello();
		System.out.println(greetings);
	}


}
