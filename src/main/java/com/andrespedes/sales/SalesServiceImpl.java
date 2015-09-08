package com.andrespedes.sales;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl implements SalesService {
	
	private final SalesRepository repository;
	
	@Inject
	public SalesServiceImpl (final SalesRepository repository){
		this.repository = repository;
	}

	@Override
	public SalesOrder save(SalesOrder sale) {
		return repository.save(sale);
	}

	@Override
	public List<SalesOrder> findAll() {
		return repository.findAll();
	}

	@Override
	public SalesOrder getSaleById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesOrder getSaleByCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SalesOrder update(SalesOrder sale) {
		// TODO Auto-generated method stub
		return null;
	}

}
