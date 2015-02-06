package org.pasut.test.spring.boot.custom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@EnableAutoConfiguration 
public class Main {

	@RequestMapping("/")
	String hello() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Main.class);
		app.setShowBanner(false);
		app.run(args);
	}

}
