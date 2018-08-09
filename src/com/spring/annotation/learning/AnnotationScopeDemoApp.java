package com.spring.annotation.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		

		Coach coachTwoA = context.getBean("tennisCoach", Coach.class);
		System.out.println(coachTwoA.getWorkoutDetail());
		System.out.println(coachTwoA.getDailyFortune());

		Coach coachTwoB = context.getBean("tennisCoach", Coach.class);
		System.out.println(coachTwoB.getWorkoutDetail());
		System.out.println(coachTwoB.getDailyFortune());

		if (coachTwoA == coachTwoB) {
			System.out.println("Both Are Same!!!!");
		} else {
			System.out.println("Both are different!!!");
		}

		context.close();
	}
}
