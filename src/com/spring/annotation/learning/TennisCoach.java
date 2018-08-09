package com.spring.annotation.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	
	public TennisCoach(@Qualifier("databaseFortuneService") FortuneService fortuneService) {
		System.out.println(">> TennisCoach: TennisCoach()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutDetail() {
		return ">> TennisCoach: Default Bean Id will be used Here";
	}

	@Override
	public String getDailyFortune() {
		return ">> TennisCoach: "+fortuneService.getFortune();
	}

}
