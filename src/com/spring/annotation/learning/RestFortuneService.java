package com.spring.annotation.learning;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Rest is working fine!!!!";
	}

}
