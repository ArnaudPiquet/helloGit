package fr.m2i.formation.rest.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWS {
	
	@GET
	public String message() {
		return "Hello World";
	}
	
	@GET
	@Path("/bzh")
	public String msgBretagne() {
		return "Hello Bzh";
	}
	
	@GET
	@Path("/tours")
	public String msgTouraine() {
		return "Hello la touraine";
	}
	
	
}
