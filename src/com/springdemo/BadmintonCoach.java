package com.springdemo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("badmintonCoach")
public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "explore all the court and boundaries,measure your strength to the distance";
	}

	@Override
	public String GetDailyFortune() {
		// TODO Auto-generated method stub
		return "If you better believe yourself";
	}

	@Required
	public void setName(String name) {
		System.out.println("Name i have already setted by bean"+name);
	}
}
