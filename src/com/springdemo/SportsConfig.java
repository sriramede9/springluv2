package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

	@Bean
	public Coach mySwimCoach() {
		return new SwimCoach(luckf()); //injection using bean ref which is luckf()
	}
	
	@Bean
	public GetFortuneService luckf() {
		return new HappyFortune();
	}
	
}
