package com.srikanth.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
								= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

		
	}

}
