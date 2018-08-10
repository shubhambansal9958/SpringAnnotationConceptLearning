package com.spring.annotation.learning;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	@PostConstruct
	public void startUp() {
		System.out.println(">> CricketCoach: startUp()");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println(">> CricketCoach: cleanUp()");
	}

	@Override
	public String toString() {
		return email + " : " + team;
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
