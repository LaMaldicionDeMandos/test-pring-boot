package org.pasut.test.spring.boot.properties.propertybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(Bean.class)
@EnableAutoConfiguration //como agregue la dependencia web (tomcat + spring MVC), asume que estoy creando una aplicacion web 
public class Main {
	private final Bean bean;
	
	@Autowired
	public Main(Bean bean) {
		this.bean = bean;
	}
	
	@RequestMapping("/")
	String hello() {
		return bean.hello();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
