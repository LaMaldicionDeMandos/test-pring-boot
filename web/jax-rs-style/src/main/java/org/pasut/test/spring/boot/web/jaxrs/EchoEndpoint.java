package org.pasut.test.spring.boot.web.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Component;

@Component
@Path("/test")
public class EchoEndpoint {

	@GET
	@Path("echo/{echo}")
	public String echo(@PathParam("echo") String echo) {
		return echo;
	}
	
	@GET
	@Path("echo/{echo}/{repeat}")
	public String echo(@PathParam("echo") String echo, @PathParam("repeat") int repeat) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < repeat; i++) {
			sb.append(" " + echo);
		}
		return sb.toString();
	}
}
