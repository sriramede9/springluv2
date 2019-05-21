package com.springdemo;

public class TrackCoach implements Coach {
	
	private GetFortuneService getFortuneService;
	
	public TrackCoach(GetFortuneService getFortuneService) {
		super();
		this.getFortuneService = getFortuneService;
	}

	

	
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
	
	//startup init method
	public void sayinit(){
		System.out.println("hello I am the staring");
	}
	
	//destroy method
	
	public void destroymeth() {
		System.out.println("yeah you just deltroyed");
	}

}
