package com.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach(GetFortuneService getFortuneService) {
		super();
		this.getFortuneService = getFortuneService;
	}

	private GetFortuneService getFortuneService;

	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run on Sand with 5 kilo weight in you backpack";
	}

	@Override
	public String GetDailyFortune() {
		// TODO Auto-generated method stub
		return getFortuneService.getMyFortune()+"from Track Coach";
	}

}
