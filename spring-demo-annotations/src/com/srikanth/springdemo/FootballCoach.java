package com.srikanth.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "practise the front kick goal";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
