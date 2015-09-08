package com.andrespedes.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	// All necessary methods are inherited
	
	Customer findByCode(int code);
}
