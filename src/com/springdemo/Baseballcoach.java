package com.springdemo;

public class Baseballcoach implements Coach {

	private GetFortuneService getFortuneService;

	public Baseballcoach(GetFortuneService getFortuneService) {
		super();
		this.getFortuneService = getFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Eat healthy run more practice till you reach goal";
	}

	@Override
	public String GetDailyFortune() {
		// TODO Auto-generated method stub
		return getFortuneService.getMyFortune();
	}

}
