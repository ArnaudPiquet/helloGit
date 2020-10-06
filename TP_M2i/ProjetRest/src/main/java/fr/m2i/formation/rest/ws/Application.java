package fr.m2i.formation.rest.ws;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rs")
public class Application extends ResourceConfig{

	public Application() {
		packages("fr.m2i.formation.rest.ws");
	}
}
