package com.springdemo;

public class CrictetCoach implements Coach {

	private GetFortuneService getFortuneService;
	private String emailAddress;
	private String team;
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 20 pushups and then a power run for 3 mins";
	}

	@Override
	public String GetDailyFortune() {
		// TODO Auto-generated method stub
		return getFortuneService.getMyFortune()+this.emailAddress+this.team;
	}

	public void setFortuneService(GetFortuneService getFortuneService) {
		this.getFortuneService = getFortuneService;
	}
	
	
	

}
