package com.srikanth.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// loading spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// getting bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// calling  methods on the bean 
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("email address : " + theCoach.getEmailAddress());
		System.out.println("team : " + theCoach.getTeam());
		
		// closing the context
		context.close();
		
	}

}
