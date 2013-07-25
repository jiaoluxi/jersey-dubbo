package com.lufax.jersey;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.PathParam;

import com.lufax.jersey.dto.Book;
import com.lufax.jersey.dto.Person;
import org.springframework.stereotype.Component;

//@Component
@Path("/demo")
public class DemoService implements DemoInterface {
	
	private Map<String, Person> repos = new HashMap<String, Person>();
	private Map<String, Book> books = new HashMap<String, Book>();
	
	
	public DemoService() {
		System.out.println("Create DemoService "+this);
//		Exception ex = new Exception("Debug DemoService");
//		ex.printStackTrace();
		
		repos.put("zhangyijun", new Person("zhangyijun", 36));
		repos.put("wangyoudong", new Person("wangyoudong", 31));
		repos.put("some", new Person("some", 24));
		repos.put("any", new Person("any", 28));
		
		books.put("first", new Book("first", repos.get("zhangyijun"), new Date(), 120));
	}

	@GET 
	@Produces(MediaType.APPLICATION_JSON)
	@Path("zhang")
	// @Consumes(MediaType.APPLICATION_JSON)
	public Person author() {
		return person("zhangyijun");
	}
	
	@GET 
	@Produces("application/json")
	@Path("person/{name}")
	// @Consumes(MediaType.APPLICATION_JSON)
	public Person person(@PathParam("name") String name) {
		return repos.get(name);
	}

	@GET 
	@Produces("application/json")
	@Path("books")
	// @Consumes(MediaType.APPLICATION_JSON)
	public List<Book> books() {
		return new ArrayList<Book>(books.values());
	}
	@GET 
	@Produces("application/json")
	@Path("book/{name}")
	// @Consumes(MediaType.APPLICATION_JSON)
	public Book book(@PathParam("name") String name) {
		return books.get(name);
	}

	@GET 
	@Produces("application/json")
	//@Consumes(MediaType.APPLICATION_JSON)
	public List<Person> index() {
		return new ArrayList<Person>(repos.values());
	}

}
