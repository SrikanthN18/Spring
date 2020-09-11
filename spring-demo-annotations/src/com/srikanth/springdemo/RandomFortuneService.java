package com.srikanth.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {"First", "Second", "Third"};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortuneService() {
		int index = myRandom.nextInt(data.length);
		String value = data[index];
 		return value;
	}

}
