package com.srikanth.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	//email and team fields
	private String emailAddress;
	private String team;
	
	//getters and setters for the email and team
	 public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside the setter method ---> setEmailAddress() ");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside the setter method ---> setTeam() ");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach : inside no-argument constructor ");
	}
	 
	 public void setFortuneService(FortuneService fortuneService) {
		 System.out.println("CricketCoach : inside the setter method ---> setFortuneService()   ");
		this.fortuneService = fortuneService;
	}
	 
	 
	@Override
	public String getDailyWorkout() {
		
		return "bowling practice has been done for about 3 hours" ;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune() ;
	}

}
