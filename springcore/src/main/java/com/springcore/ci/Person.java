package com.springcore.ci;

public class Person {

	private String name;
	private int personID;
	private Certificate certi;
	
	public Person(String name, int personID, Certificate certi) {
		this.name = name;
		this.personID = personID;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", personID=" + this.personID + ", certi=" + this.certi + this.certi.name +"]";
	}

	
	
}
