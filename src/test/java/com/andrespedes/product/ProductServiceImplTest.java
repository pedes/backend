package com.andrespedes.product;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplTest {

	@Mock
	private ProductRepository repository;
	
	private ProductService productService;

	@Before
	public void setUp() throws Exception {
		productService = new ProductServiceImpl(repository);
	}
	
	private Product stubProduct() {
		Product product = new Product();
		product.setCode(12);
		product.setDescription("Printer	");
		product.setPrice(50.00);
		product.setQuantity(40);
        when(repository.save(any(Product.class))).thenReturn(product);
        return product;
    }
	
    public void testCreateProduct_successful() throws Exception {
        final Product product = stubProduct();
        final Product returnedPRoduct = productService.save(product);
        
        assertTrue(returnedPRoduct.getCode() == product.getCode());
    }

}
