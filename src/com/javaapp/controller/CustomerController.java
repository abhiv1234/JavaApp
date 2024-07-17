package com.javaapp.controller;

import com.javaapp.enums.AccountType;
import com.javaapp.model.Customer;
import com.javaapp.service.CustomerService;

public class CustomerController {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		
		Customer c1 = new Customer(1, "Abhi V", "NYC", 55000, AccountType.SAVINGS_GOLD);
		Customer c2 = new Customer(2, "Abhishek V", "london", 45000, AccountType.SAVINGS_SILVER);
		
		customerService.computeCustomerCategory(c2);
		
//		System.out.println("Category: "+c1.getCategory());
		System.out.println("Category: "+c2.getCategory());
		System.out.println(c2);
	}

}

/*
* Customer customer : reference
* new Customer() : object
*
* JVM says, reference goes in stack where as object goes in heap
* 
* 
* 
* JVM says, if you want me to display instance variable values instead of memory location, when displaying the object, 
* then you must override toString() method in your class
* 
* Rule in Java : every class in java has a super class called Object which has toString() method.
* So you must override this toString() in sub class
*/