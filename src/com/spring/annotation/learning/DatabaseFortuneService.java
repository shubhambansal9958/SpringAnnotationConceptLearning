package com.spring.annotation.learning;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your data is in safe hands";
	}

}
