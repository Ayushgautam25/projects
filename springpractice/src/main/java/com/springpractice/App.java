package com.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext Ayush1 = new ClassPathXmlApplicationContext("config.xml");
		Student stu1 = (Student) Ayush1.getBean("s1");
		Student stu2 = (Student) Ayush1.getBean("s2");
		Student stu3 = (Student) Ayush1.getBean("s3");
		Student stu4 = (Student) Ayush1.getBean("s4");
		Student stu5 = (Student) Ayush1.getBean("s5");
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);
		System.out.println(stu5);
	}
}
