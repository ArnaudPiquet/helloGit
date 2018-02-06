package fr.m2i.formation.rest.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.m2i.formation.rest.bean.Adresse;
import fr.m2i.formation.rest.bean.Personne;

@Path("/pers")
public class PersonneWS {

	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPersonneText() {
		Personne p = new Personne("Dupond","Jules", new Adresse("rue Lajoie", "44000", "Nantes", 15));
		return p.toString();
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Personne getPersonneXml() {
		Personne p = new Personne("Lavoisier","Anne", new Adresse("rue Colbert", "37000", "Tours", 5));
		return p;
	}
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Personne getPersonneJson() {
		Personne p = new Personne("Lavoisier","Anne", new Adresse("rue Colbert", "37000", "Tours", 5));
		return p;
	}
}
