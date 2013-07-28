package com.lufax.jersey.demo;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.lufax.jersey.demo.dto.Book;
import com.lufax.jersey.demo.dto.Person;

@Path("/duck")
public class DuckConsumer {
	
	public DuckConsumer() {
		System.out.println("Create Duck Consumer "+this);
	}

	//@InjectParam("remoteDemo")
	private DuckInterface demo;

	public DuckInterface getDemo() {
		return demo;
	}

	public void setDemo(DuckInterface demo) {
		System.out.println("Set duck "+demo);
		this.demo = demo;
	}

	@GET 
	@Produces("application/json")
	@Path("person/{name}")
	public Person person(@PathParam("name") String name) {
		Person p = demo.person(name);
		p.setInfo("Duck "+this.demo.toString());
		return p;
	}

	@GET 
	@Produces("application/json")
	@Path("book/{name}")
	public Book book(@PathParam("name") String name) {
		Book b = demo.book(name);
		b.setInfo("Duck "+this.demo.toString());
		return b;
	}

	@GET 
	@Produces("application/json")
	@Path("books")
	public List<Book> books() {
		return demo.books();
	}

	@GET 
	@Produces("application/json")
	public List<Person> index() {
		return demo.index();
	}
	
}
