package com.srikanth.springDemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {

		return "Practise golf-batting for about thirty minutes";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
