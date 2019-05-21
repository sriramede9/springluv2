 package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
public static void main(String[] args) {
	//load the spring config file
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	
	
	//retrieve beans from spring containers
	
	Coach cc= context.getBean("bbCoach",Coach.class);
	
	Coach cc1= context.getBean("bbCoach",Coach.class);
	
	if(cc==cc1) {
		System.out.println("Singleton");
	}else {
		System.out.println("Prototype");
	}

	System.out.println(cc.getDailyWorkout());
	context.close();
}
}
 