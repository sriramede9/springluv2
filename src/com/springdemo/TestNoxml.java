package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestNoxml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

		Coach swimCoach = context.getBean("mySwimCoach", SwimCoach.class);

		System.out.println(swimCoach.GetDailyFortune() + "\t" + swimCoach.getDailyWorkout());

		System.out.println(((SwimCoach) swimCoach).getName());// setter method with @value(Sriramede) will return the
																// string when getter used

		context.close();
	}

}
