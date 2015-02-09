package org.pasut.test.spring.boot.logging.file;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration //como agregue la dependencia web (tomcat + spring MVC), asume que estoy creando una aplicacion web 
public class Main {
	private final static Logger log = Logger.getLogger(Main.class);
	
	@RequestMapping("/")
	String hello() {
		log.debug("Llama a Hello");
		return "Hola";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
