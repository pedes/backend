package com.andrespedes.sales;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {

	private final SalesService salesService;
	
	@Inject
	public SalesController(final SalesService salesService) {
		this.salesService = salesService;
	}
	
	@RequestMapping(value = "/salesorder", method = RequestMethod.POST)
	public SalesOrder createProduct(@RequestBody @Valid final SalesOrder sale) {
		return salesService.save(sale);
	}

	@RequestMapping(value = "/salesorder", method = RequestMethod.GET)
	public List<SalesOrder> listAllProducts() {
		return salesService.findAll();
	}

}
