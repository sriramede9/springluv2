package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	public SwimCoach(GetFortuneService getFortuneService) {
		super();
		this.getFortuneService = getFortuneService;
	}

	private GetFortuneService getFortuneService;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 mts for warm up";
	}

	@Override
	public String GetDailyFortune() {
		// TODO Auto-generated method stub
		return getFortuneService.getMyFortune();
	}

	@Value("Sri ram ede")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
