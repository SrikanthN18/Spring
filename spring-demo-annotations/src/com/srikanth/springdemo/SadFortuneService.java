package com.srikanth.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		
		return "Today is the sad day!";
	}

}
