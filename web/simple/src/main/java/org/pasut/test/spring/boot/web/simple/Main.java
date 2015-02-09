package org.pasut.test.spring.boot.web.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/echo/{echo}", method=RequestMethod.GET)
	String echo(@PathVariable String echo) {
		return echo;
	}
	
	@RequestMapping(value="/echo/{echo}/{repeat}", method=RequestMethod.GET)
	String echo(@PathVariable("echo") String value, @PathVariable("repeat") int repeat) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < repeat; i++) {
			sb.append(" " + value);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
