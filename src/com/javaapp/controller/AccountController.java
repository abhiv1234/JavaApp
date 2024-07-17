package com.javaapp.controller;

import com.javaapp.enums.AccountType;
import com.javaapp.model.Account;
import com.javaapp.model.AccountHolder;
import com.javaapp.service.AccountService;

public class AccountController {

	public static void main(String[] args) {
		
		AccountService accountService = new AccountService();
		
		AccountHolder accountHolder = new AccountHolder(1, "london", "harry potter");
		Account account = new Account(1,AccountType.SAVINGS,10000,4.5);
		
//		Attach account to AccountHolder
		accountHolder.setAccount(account);
		System.out.println(accountHolder);
		System.out.println("******After Deposit******");
		accountService.deposit(accountHolder, 2000);
		System.out.println(accountHolder);
		System.out.println("******After Withdrawal******");
		accountService.withdrawal(accountHolder, 3000);
		System.out.println(accountHolder);
	}

}
