package fr.m2i.formation.rest.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calcul")
public class Calcul {

	@GET
	@Path("/add/{a}/{b}")
	public String add(@PathParam("a")int a,@PathParam("b") int b) {
		return a+" + "+b+" = "+(a+b);
	}
	
	@GET
	@Path("/{a}-{b}")
	public String sous(@PathParam("a")int a,@PathParam("b")int b) {
		return a+" - "+b+" = "+(a-b);
	}
	
}
