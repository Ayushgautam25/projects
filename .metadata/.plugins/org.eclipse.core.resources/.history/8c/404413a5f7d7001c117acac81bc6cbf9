package com.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext Ayush = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) Ayush.getBean("Emp1");
		System.out.println(emp);
		Ayush.registerShutdownHook();
	}
}
