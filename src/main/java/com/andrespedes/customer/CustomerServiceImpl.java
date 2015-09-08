package com.andrespedes.customer;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository repository;
	
	@Inject
	public CustomerServiceImpl(final CustomerRepository customerRepository){
		this.repository = customerRepository;
	}
	
	@Override
	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		return repository.getOne(id);
	}

	@Override
	public Customer getCustomerByCode(int code) {
		return repository.findByCode(code);
	}

	@Override
	@Transactional
	public boolean delete(int code) {
		Customer customerToDelete = repository.findByCode(code);
		repository.delete(customerToDelete.getId());
		return true;
	}

	@Override
	@Transactional
	public Customer update(Customer customer) {
		Customer actualCustomer = repository.findByCode(customer.getCode());
		customer.setId(actualCustomer.getId());
		return repository.saveAndFlush(customer);
	}

}
