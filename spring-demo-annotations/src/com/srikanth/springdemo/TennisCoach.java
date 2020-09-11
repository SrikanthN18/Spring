package com.srikanth.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach : Inside default constructor");
	}
	 
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach : Inside setFortuneService() setter method");
//		this.fortuneService = fortuneService;
//	}
//	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach : Inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	

	public void doMyStruff() {
		System.out.println("Tennis Coach : Inside doMyStuff()");
	}
	
	@Override
	public String getDailyWorkout() { 
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
