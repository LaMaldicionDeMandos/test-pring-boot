package org.pasut.test.spring.boot.custom;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Print: " + args);
	}

}
