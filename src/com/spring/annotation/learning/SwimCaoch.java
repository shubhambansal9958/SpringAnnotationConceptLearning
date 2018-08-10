package com.spring.annotation.learning;

import org.springframework.beans.factory.annotation.Value;

public class SwimCaoch implements Coach {

	@Value("${email}")
	String email;
	
	@Value("${team}")
	String team;
	
	FortuneService fortuneService;
	
	public SwimCaoch(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String toString() {
		return ">> SwimCoach: Email->"+email+" ,Team->"+team;
	}

	@Override
	public String getWorkoutDetail() {
		return ">> SwimCoach: 3000 mts / day";
	}

	@Override
	public String getDailyFortune() {
		return ">> SwimCoach: "+fortuneService.getFortune();
	}

}
