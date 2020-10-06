package fr.m2i.formation.rest.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.m2i.formation.rest.bean.Adresse;
import fr.m2i.formation.rest.bean.Personne;

@Path("/pers")
public class PersonneWS {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPersonneText() {
		Personne p = new Personne("Dupond","Jules", new Adresse("rue Lajoie", "44000", "Nantes", 15));
		return p.toString();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Personne getPersonneXml() {
		Personne p = new Personne("Lavoisier","Anne", new Adresse("rue Colbert", "37000", "Tours", 5));
		return p;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Personne getPersonneJson() {
		Personne p = new Personne("Lavoisier","Anne", new Adresse("rue Colbert", "37000", "Tours", 5));
		return p;
	}
	
	
	@GET
	@Path("/listexml")
	@Produces(MediaType.APPLICATION_XML)
	public List<Personne> getListePersonneTxt() {
		Personne p1 = new Personne("Lavoisier","Anne", new Adresse("rue Colbert", "37000", "Tours", 5));
		Personne p2 = new Personne("Dupond","Jules", new Adresse("rue Lajoie", "44000", "Nantes", 15));
		List<Personne> listeP = new ArrayList<Personne>();
		listeP.add(p1);
		listeP.add(p2);
		return listeP;
	}
	
	@GET
	@Path("/listejson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Personne> getListePersonneJson() {
		Personne p1 = new Personne("Lavoisier","Anne", new Adresse("rue Colbert", "37000", "Tours", 5));
		Personne p2 = new Personne("Dupond","Jules", new Adresse("rue Lajoie", "44000", "Nantes", 15));
		List<Personne> listeP = new ArrayList<Personne>();
		listeP.add(p1);
		listeP.add(p2);
		return listeP;
	}
	
}
