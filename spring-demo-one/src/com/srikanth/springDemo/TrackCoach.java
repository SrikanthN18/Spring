package com.srikanth.springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService; 
	
	public TrackCoach() {
		
	}
	
	public TrackCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it !!! " + fortuneService.getFortune();
	}
	
	public void doMyStuff() {
		System.out.println("Inside method : doMyStuff");
	}
	
	public void cleanMyStuff() {
		System.out.println("Inside method : cleanMyStuff");	
	}

}
