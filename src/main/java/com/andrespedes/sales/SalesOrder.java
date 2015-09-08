package com.andrespedes.sales;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.andrespedes.customer.Customer;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="sales_order")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SalesOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5203635330926409719L;
	
	@Id
	@Column(name = "id")
    private int id;
	
//	ArrayList<OrderLine> orderLines = new ArrayList<OrderLine>();
	
	@Column(name = "customer_code", nullable = false)
	private int customerCode;
	
	@Column(name = "order_number", nullable = false)
	private int orderNumber;
	
	@Column(name = "total_price", nullable = false)
	private double total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public ArrayList<OrderLine> getOrderLines() {
//		return orderLines;
//	}
//
//	public void setOrderLines(ArrayList<OrderLine> orderLines) {
//		this.orderLines = orderLines;
//	}

	public int getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(int customer) {
		this.customerCode = customer;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
