package com.javaapp.dao;

import com.javaapp.model.AccountHolder;

public interface AccountDao {
	void deposit(AccountHolder accountHolder, double amount);
	void withdrawal(AccountHolder accountHolder, double amount);
}
