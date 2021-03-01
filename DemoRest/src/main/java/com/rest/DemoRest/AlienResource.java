package com.rest.DemoRest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien(){
		System.out.println("This is called !!!!!!!!!");
		List<Alien> list = new ArrayList<Alien>();
		Alien a1 = new Alien();
		a1.setName("Aaish");
		a1.setScores(70);
		
		
		Alien a2 = new Alien();
		a2.setName("Nik");
		a2.setScores(60);
		list.add(a1);
		list.add(a2);
		return list;
	}
}
