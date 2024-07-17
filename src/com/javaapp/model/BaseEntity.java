package com.javaapp.model;

public abstract class BaseEntity { //extends Object

//	I made this class as abstract since I didn't want anyone to create its object
	
//	Abstract classes can have abstract methods
//	If a method is only defined and not implemented then it is an abstract method
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract String toString();
	
}
