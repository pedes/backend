package com.andrespedes.product;

import java.util.List;

public interface ProductService {

	Product save(Product product);
	
	List<Product> findAll();
	
	Product getProductById(int id);
	
	Product getProductByCode(int code);
	
	boolean delete(int id);

	Product update(Product product);
}
