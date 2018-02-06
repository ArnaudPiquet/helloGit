package fr.m2i.formation.rest.ws;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/heure")
public class HorlogeWS {
	@GET
	public String getHeure() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy- HH:mm:ss");
		return sdf.format(new Date());
	}
}
