package com.lufax.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lufax.jersey.dto.Person;

@Path("/person/")
public class PersonService {

	@GET 
	@Produces("application/json")
	@Path("zhang")
	@Consumes(MediaType.APPLICATION_JSON)
	public Person author() {
		return new Person("zhangyijun", 36);
	}
	
}
