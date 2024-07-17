package com.javaapp.model;

public class AccountHolder {

	private int id;
	private String city;
	private String name;
	private Account account; // Has-a relationship : AccountHolder has-a Account
	
	public AccountHolder(int id, String city, String name) {
		super();
		this.id = id;
		this.city = city;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "AccountHolder [id=" + id + ", city=" + city + ", name=" + name + ", account=" + account + "]";
	}
}
