package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retreive bean
		
		Coach ccCoach=context.getBean("myCoach",Coach.class);
		//call lmethods on bean
		
		System.out.println(ccCoach.getDailyWorkout()+"syss"+ccCoach.GetDailyFortune());
		
		Coach bbCoach=context.getBean("bbCoach",Coach.class);
		
		System.out.println(bbCoach.getDailyWorkout()+"syss"+bbCoach.GetDailyFortune());
		
		//close the context
		context.close();
	}

}
