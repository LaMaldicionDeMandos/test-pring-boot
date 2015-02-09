package org.pasut.test.spring.boot.profiling.custombean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class ProductionBean implements CustomBean {

	@Override
	public String getText() {
		return "Production";
	}

}
