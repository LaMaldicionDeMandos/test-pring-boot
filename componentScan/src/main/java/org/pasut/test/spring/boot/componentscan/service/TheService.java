package org.pasut.test.spring.boot.componentscan.service;

import org.springframework.stereotype.Service;

@Service
public class TheService implements org.pasut.test.spring.boot.componentscan.service.Service{
	@Override
	public String getText() {
		return "Texto";
	}
}
