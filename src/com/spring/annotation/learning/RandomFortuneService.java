package com.spring.annotation.learning;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] data = {
		"Beware of dogs",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	@Override
	public String getFortune() {
		int x = (int ) ( Math.random()*data.length );
		return data[x];
	}

}
