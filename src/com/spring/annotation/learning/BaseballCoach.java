package com.spring.annotation.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach() {
		System.out.println(">> BaseballCoach: BaseballCoach()");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> BaseballCoach: setFortuneService()");
		this.fortuneService = fortuneService;
	}

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> BaseballCoach: doSomeCrazyStuff()");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getWorkoutDetail() {
		return ">> BaseballCoach: 30 mins hard workout";
	}

	@Override
	public String getDailyFortune() {

		return ">> BaseballCoach: " + fortuneService.getFortune();
	}
}
