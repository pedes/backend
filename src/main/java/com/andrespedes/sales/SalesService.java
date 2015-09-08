package com.andrespedes.sales;

import java.util.List;

public interface SalesService {
	
	SalesOrder save(SalesOrder sale);
	
	List<SalesOrder> findAll();
	
	SalesOrder getSaleById(int id);
	
	SalesOrder getSaleByCode(int code);
	
	boolean delete(int id);

	SalesOrder update(SalesOrder sale);

}
