package com.spring.annotation.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("swimCoach" , Coach.class);
		
		System.out.println(coach.getWorkoutDetail());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach);
		
		context.close();
	}

}
