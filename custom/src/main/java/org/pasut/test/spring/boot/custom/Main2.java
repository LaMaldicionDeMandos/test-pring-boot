package org.pasut.test.spring.boot.custom;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@EnableAutoConfiguration
public class Main2 {

	@RequestMapping("/")
	String hello() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(Main2.class)
		.showBanner(false)
		.run(args);
	}

}
