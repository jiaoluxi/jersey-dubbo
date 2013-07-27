package com.lufax.jersey.demo;

import java.util.List;

import com.lufax.jersey.demo.dto.Book;
import com.lufax.jersey.demo.dto.Person;

public interface DemoInterface {

	public Person person(String name);
	public Book book(String name);
	
	public List<Book> books();
	public List<Person> index();
}
