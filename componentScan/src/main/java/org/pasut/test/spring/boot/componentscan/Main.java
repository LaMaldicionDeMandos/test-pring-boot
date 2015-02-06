package org.pasut.test.spring.boot.componentscan;

import org.pasut.test.spring.boot.componentscan.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Todas las annotations comentadas, estan incluidas en la annotation que no está comentada
@RestController
//@Configuration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan
@SpringBootApplication
public class Main {
	private final Service service;
	@Autowired
	public Main(Service service) {
		this.service = service;
	}
	@RequestMapping("/")
	String text() {
		return service.getText();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
