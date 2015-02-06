package org.pasut.test.spring.boot.custom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;

@EnableAutoConfiguration
public class Main3 {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Main.class);
		app.setShowBanner(false);
		app.addListeners((ApplicationStartedEvent e) -> System.out.println("AppStarted"));
		app.addListeners((ApplicationEnvironmentPreparedEvent e) ->  System.out.println("EnvPrepared"));
		app.run(args);
	}
}
