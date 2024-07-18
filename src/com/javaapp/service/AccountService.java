package com.javaapp.service;

import com.javaapp.dao.AccountDao;
import com.javaapp.exceptions.IllegalAmountException;
import com.javaapp.exceptions.InsufficientFundsException;
import com.javaapp.exceptions.OverTheLimitException;
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
	public void withdrawal(AccountHolder accountHolder, double amount) throws InsufficientFundsException,
	OverTheLimitException, IllegalAmountException {
		if(accountHolder.getAccount().getBalance() < amount) {
			throw new InsufficientFundsException("balance < amount");
		}
		
		if(amount > AccountDao.limit) {
			throw new OverTheLimitException("amount > limit");
		}
		
		if(amount <= 0) {
			throw new IllegalAmountException("amount <= 0");
		}
		
//		Fetch account from AccountHolder
		Account account = accountHolder.getAccount();
//		Compute balance by subtracting amount and set it to account
		double newBalance = account.getBalance() - amount;
		account.setBalance(newBalance);
//		Update account of AccountHolder
		accountHolder.setAccount(account);
	}

}
