package com.andrespedes.product;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository repository;
	
	@Inject
	public ProductServiceImpl(final ProductRepository repository){
		this.repository = repository;
	}

	@Override
	@Transactional
	public Product save(Product product)  {
		return repository.saveAndFlush(product);
	}

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return repository.getOne(id);
	}
	
	@Override
	public Product getProductByCode(int code) {
		return repository.findByCode(code);
	}

	@Override
	@Transactional
	public boolean delete(int code) {
		Product productToDelete = repository.findByCode(code);
		repository.delete(productToDelete.getId());
		return true;
	}
	
	@Override
	@Transactional
	public Product update(Product product)  {
		Product returnedProduct = repository.findByCode(product.getCode());
		product.setId(returnedProduct.getId());
		return repository.saveAndFlush(product);
	}

}
