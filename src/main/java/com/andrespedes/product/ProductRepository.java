package com.andrespedes.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	// All other necessary methods are inherited
	
	Product findByCode(int code);
}
