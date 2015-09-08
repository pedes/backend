package com.andrespedes.customer;

import java.util.List;

public interface CustomerService {
	
	Customer save(Customer customer);

	List<Customer> findAll();
	
	Customer getCustomerById(int id);
	
	Customer getCustomerByCode(int code);
	
	boolean delete(int code);

	Customer update(Customer customer);
}
