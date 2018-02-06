package fr.m2i.formation.rest.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/bonjour")
public class Bonjour {

		@GET
		@Path("{nom}")
		public String bonjour(@PathParam("nom") String name){

			return "Bonjour "+name;
		}
		
		@GET
		@Path("{nom}/{prenom}")
		public String bonjourNP(@PathParam("nom") String name, @PathParam("prenom") String pre){

			return "Bonjour "+name+" "+pre;
		}

}
