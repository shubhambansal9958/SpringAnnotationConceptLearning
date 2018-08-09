package com.spring.annotation.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coachOne = context.getBean("thatSillyCoach", Coach.class);
		System.out.println(coachOne.getWorkoutDetail());
		System.out.println(coachOne.getDailyFortune());

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

		Coach coachThree = context.getBean("cricketCoach", Coach.class);
		System.out.println(coachThree.getWorkoutDetail());
		System.out.println(coachThree.getDailyFortune());
		System.out.println(coachThree);

		context.close();
	}

}
