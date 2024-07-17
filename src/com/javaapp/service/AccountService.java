package com.javaapp.service;

import com.javaapp.dao.AccountDao;
import com.javaapp.model.Account;
import com.javaapp.model.AccountHolder;

public class AccountService implements AccountDao {


	@Override
	public void deposit(AccountHolder accountHolder, double amount) {
//		Fetch account from AccountHolder
		Account account = accountHolder.getAccount();
//		Compute balance by adding amount and set it to account
		double newBalance = account.getBalance() + amount;
		account.setBalance(newBalance);
//		Update account of AccountHolder
		accountHolder.setAccount(account);
	}

	@Override
	public void withdrawal(AccountHolder accountHolder, double amount) {
//		Fetch account from AccountHolder
		Account account = accountHolder.getAccount();
//		Compute balance by subtracting amount and set it to account
		double newBalance = account.getBalance() - amount;
		account.setBalance(newBalance);
//		Update account of AccountHolder
		accountHolder.setAccount(account);
	}

}
