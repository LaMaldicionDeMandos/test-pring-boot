package org.pasut.test.spring.boot.profiling.including;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration //como agregue la dependencia web (tomcat + spring MVC), asume que estoy creando una aplicacion web 
public class Main {
	
	@RequestMapping("/")
	String hello(@Value("${ambiente}") String ambiente, @Value("${name}") String name) {
		return "Ambiente: " + ambiente + " - Name: " + name;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
