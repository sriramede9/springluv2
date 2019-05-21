package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotateApplicationContext.xml");
		
		Coach badmintoCoach=context.getBean("badmintonCoach",Coach.class);
		
		System.out.println(badmintoCoach.getDailyWorkout());
		
		context.close();
	}
}
