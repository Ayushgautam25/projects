package com.tutorial;

import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("HelloWorld");
		System.out.println(helloWorld.getMessage());
	}
}
