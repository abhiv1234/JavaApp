package com.javaapp.model;

public class Product extends BaseEntity {
	
	private String title;
	private double price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [title=" + title + ", price=" + price + ", id=" + id + "]";
	}

}
