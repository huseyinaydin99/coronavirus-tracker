package com.huseyinaydin.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.huseyinaydin") //@PostConstruct'u bulması için
public class CoronavirusTrackerApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot başlıyor");
		SpringApplication.run(CoronavirusTrackerApplication.class, args);
		System.out.println("Spring Boot başladı");
	}

}
