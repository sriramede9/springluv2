package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach theCoach=new Baseballcoach();
		
		Coach theTrackCoach=new TrackCoach();
		
		System.out.println(theTrackCoach.getDailyWorkout());
	}

}
  