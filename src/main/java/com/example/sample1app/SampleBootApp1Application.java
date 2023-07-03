package com.example.sample1app;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleBootApp1Application {

	public static void main(String[] args) {
		// SpringApplication.run(SampleBootApp1Application.class, args);
		SpringApplication app = new SpringApplication(SampleBootApp1Application.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "Hello,Spring Boot 3!!!";
	}

}
