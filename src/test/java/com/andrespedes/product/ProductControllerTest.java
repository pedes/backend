package com.andrespedes.product;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {
	
	@Mock
	private ProductService productService;

	private ProductController productController;
	
	@Before
	public void setUp(){
		productController = new ProductController(productService);
	}
	

	public void createProductTest(){
		final Product product = new Product();
		product.setCode(5);
		product.setDescription("Chairs");
		product.setPrice(100.00d);
		product.setQuantity(2500);
		Product returnedProduct = productController.createProduct(product);

		 assertEquals(product, returnedProduct);
	}
}
