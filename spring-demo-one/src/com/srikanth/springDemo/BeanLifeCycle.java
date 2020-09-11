package com.srikanth.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("Retrieve method : " + theCoach.getDailyWorkout());
		
		context.close();
	}

}
