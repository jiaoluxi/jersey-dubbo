package com.lufax.jersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.lufax.jersey.dto.Book;
import com.lufax.jersey.dto.Person;
import com.sun.jersey.api.core.InjectParam;
import org.springframework.stereotype.Component;

//@Component
@Path("/consumer")
public class DemoConsumer {
	
	public DemoConsumer() {
		System.out.println("Create DemoConsumer "+this);
	}

	//@InjectParam("remoteDemo")
	private DemoInterface demo;

	public DemoInterface getDemo() {
		return demo;
	}

	public void setDemo(DemoInterface demo) {
		System.out.println("Set demo "+demo);
		this.demo = demo;
	}

	@GET 
	@Produces("application/json")
	@Path("person/{name}")
	public Person person(@PathParam("name") String name) {
		Person p = demo.person(name);
		p.setInfo(this.demo.toString());
		return p;
	}

	@GET 
	@Produces("application/json")
	@Path("book/{name}")
	public Book book(@PathParam("name") String name) {
		Book b = demo.book(name);
		b.setInfo(this.demo.toString());
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
