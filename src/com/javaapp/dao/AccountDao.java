package com.javaapp.dao;

import com.javaapp.exceptions.IllegalAmountException;
import com.javaapp.exceptions.InsufficientFundsException;
import com.javaapp.exceptions.OverTheLimitException;
import com.javaapp.model.AccountHolder;

public interface AccountDao {
	double limit = 5000; //public static final
	void deposit(AccountHolder accountHolder, double amount);
	void withdrawal(AccountHolder accountHolder, double amount) throws InsufficientFundsException,
	OverTheLimitException, IllegalAmountException;
}

/* 
 * A variable in interface by default is, public final static
 */