package spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.spring.aop.Stock;

@Configuration
public class SpringConfig {
	
	@Bean
	public Stock createStock() {
		return new Stock(101, "SpaceX", 1200);
	}
}
