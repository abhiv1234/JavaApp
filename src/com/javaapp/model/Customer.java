package com.javaapp.model;

import com.javaapp.enums.AccountType;

public class Customer extends BaseEntity {

//	customer is getting id from BaseEntity along with getter setter
//	instance variables (belong to the class)
	
//	When a class (Customer) extends and abstract class(BaseEntity), then it must override all abstract methods

	private String name;
	private String city;
	private double balance;
	private AccountType accountType;
	private String category;
		
//	Constructors are used to initialize instance variables.
	public Customer(int id, String name, String city, int balance, AccountType accountType) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.balance = balance;
		this.accountType = accountType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", balance=" + balance + ", accountType=" + accountType
				+ ", category=" + category + ", id=" + id + "]";
	}

}
