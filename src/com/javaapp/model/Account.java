package com.javaapp.model;

import com.javaapp.enums.AccountType;

public class Account {

	private int id;
	private AccountType accountType;
	private double balance;
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + ", balance=" + balance + ", rateOfInterest="
				+ rateOfInterest + "]";
	}

	private double rateOfInterest;
	
	public Account(int id, AccountType accountType, double balance, double rateOfInterest) {
		this.id = id;
		this.accountType = accountType;
		this.balance = balance;
		this.rateOfInterest = rateOfInterest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

}
