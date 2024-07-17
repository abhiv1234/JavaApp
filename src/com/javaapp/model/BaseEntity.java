package com.javaapp.model;

public abstract class BaseEntity extends Object {

	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract String toString();
	
}
