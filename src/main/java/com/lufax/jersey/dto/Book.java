package com.lufax.jersey.dto;

import java.util.Date;

public class Book implements java.io.Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4499114169509794596L;


	public Book() {
		
	}

	public Book(String name, Person author, Date publish, int pages) {
		this();
		this.name = name;
		this.author = author;
		this.publish = publish;
		this.pages = pages;
	}

	private String name;
	private Person author;
	private Date publish;
	private int pages;
	

	public Date getPublish() {
		return publish;
	}

	public void setPublish(Date publish) {
		this.publish = publish;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	
}
