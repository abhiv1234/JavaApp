package com.javaapp.service;

import com.javaapp.model.Customer;

public class CustomerService {

	public void computeCustomerCategory(Customer customer) {

		String category = customer.getCity().toLowerCase().equals("nyc")?
				customer.getBalance()>50000?
						customer.getAccountType().equals("SAVINGS_GOLD")?
								"Category C":"":"":"";
		if(category.equals(""))
		category = customer.getCity().toLowerCase().equals("london")?
						customer.getBalance()>40000?
								customer.getAccountType().equals("SAVINGS_SILVER")?
										"Category A":"":"":"";
		if(category.equals(""))
		category = "Category B";
		
		customer.setCategory(category);
		
	}

}
