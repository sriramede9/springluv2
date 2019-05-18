package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive bean
		
		Coach trackCoach=context.getBean("myCoach",Coach.class);
		//call lmethods on bean
		
		System.out.println(trackCoach.getDailyWorkout()+"syss");
		
		//close the context
		context.close();
	}

}
