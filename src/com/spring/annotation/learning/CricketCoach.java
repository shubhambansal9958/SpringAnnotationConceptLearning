package com.spring.annotation.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fortuneService;

	@Value("${email}")
	String email;

	@Value("${team}")
	String team;

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println(">> CricketCoach: CricketCoach()");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return email+" : "+team;
	}

	@Override
	public String getWorkoutDetail() {
		return ">> TennisCoach: Score 230 runs in a match";
	}

	@Override
	public String getDailyFortune() {
		return ">> TennisCoach: " + fortuneService.getFortune();
	}

}
