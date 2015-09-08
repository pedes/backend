package com.andrespedes.customer;

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
public class CustomerController {

	private final CustomerService customerService;

	@Inject
	public CustomerController(final CustomerService customerService) {
		this.customerService = customerService;
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public Customer createCustomer(@RequestBody @Valid final Customer customer) {
		return customerService.save(customer);
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public List<Customer> listAllCustomers() {
		return customerService.findAll();
	}

	@RequestMapping(value = "/customerid/{id}", method = RequestMethod.GET)
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}

	@RequestMapping(value = "/customer/{code}", method = RequestMethod.GET)
	public Customer getProductByCode(@PathVariable int code) {
		return customerService.getCustomerByCode(code);
	}

	@RequestMapping(value = "/customer/{code}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProduct(@PathVariable int code) {
		customerService.delete(code);
	}

	@RequestMapping(value = "/customer/{code}", method = RequestMethod.PUT)
	@ResponseBody
	public Customer updateCustomer(@PathVariable int code, @RequestBody Customer customer) {
		customer.setCode(code);
		return customerService.update(customer);
	}
}
