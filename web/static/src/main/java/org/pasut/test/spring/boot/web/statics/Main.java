package org.pasut.test.spring.boot.web.statics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@EnableAutoConfiguration //como agregue la dependencia web (tomcat + spring MVC), asume que estoy creando una aplicacion web 
public class Main {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	String hello() {
		return "Hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
