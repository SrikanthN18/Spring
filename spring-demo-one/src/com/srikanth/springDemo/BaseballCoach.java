package com.srikanth.springDemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService; 
	
	public BaseballCoach (FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "you practised batting for 30 mins" ; 
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
}
