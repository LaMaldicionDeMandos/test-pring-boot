package org.pasut.test.spring.boot.custom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@EnableAutoConfiguration
public class Main3 {

	@RequestMapping("/")
	String hello() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Main.class);
		app.setShowBanner(false);
		app.addListeners((ApplicationStartedEvent e) -> System.out.println("AppStarted"));
		app.addListeners((ApplicationEnvironmentPreparedEvent e) ->  System.out.println("EnvPrepared"));
		app.run(args);
	}
}
