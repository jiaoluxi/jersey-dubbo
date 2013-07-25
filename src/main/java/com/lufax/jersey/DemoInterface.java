package com.lufax.jersey;

import java.util.List;

import com.lufax.jersey.dto.Book;
import com.lufax.jersey.dto.Person;

public interface DemoInterface {

	public Person person(String name);
	public Book book(String name);
	
	public List<Book> books();
	public List<Person> index();
}
