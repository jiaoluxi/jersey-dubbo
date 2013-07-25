package com.lufax.jersey.dto;

//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlAttribute;

public class Person  implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5594659787535770556L;

	public Person() {

	}

	public Person(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
