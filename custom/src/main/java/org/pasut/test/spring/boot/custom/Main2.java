package org.pasut.test.spring.boot.custom;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Main2 {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Main2.class)
		.showBanner(false)
		.run(args);
	}

}
