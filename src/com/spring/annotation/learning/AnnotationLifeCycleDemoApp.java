package com.spring.annotation.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationLifeCycleDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("cricketCoach", Coach.class);
		System.out.println(coach.getWorkoutDetail());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach);

		context.close();
	}

}
