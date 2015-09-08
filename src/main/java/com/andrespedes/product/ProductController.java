package com.andrespedes.product;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	private final ProductService productService;

	@Inject
	public ProductController(final ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public Product createProduct(@RequestBody @Valid final Product product) {
		return productService.save(product);
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> listAllProducts() {
		return productService.findAll();
	}

	@RequestMapping(value = "/productid/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	public Product getProductByCode(@PathVariable int id) {
		return productService.getProductByCode(id);
	}
	
	@RequestMapping(value="/product/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProduct(@PathVariable int id) {
		productService.delete(id);
	}
	
	@RequestMapping(value="/product/{id}",method = RequestMethod.PUT)
	@ResponseBody
	public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
		product.setCode(id);
		return productService.update(product);
	}

}
