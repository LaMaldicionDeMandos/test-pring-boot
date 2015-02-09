package org.pasut.test.spring.boot.web.jaxrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EnableAutoConfiguration //como agregue la dependencia web (tomcat + spring MVC), asume que estoy creando una aplicacion web 
public class Main {
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
