package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach theCoach=new Baseballcoach(new HappyFortune());
		
		Coach theTrackCoach=new TrackCoach(new HappyFortune());
		
		System.out.println(theTrackCoach.GetDailyFortune());
	}

}
  