package com.andrespedes.sales;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="orders_per_sale")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrderLinesPerSale implements Serializable {

	
	/**
	 * default generated serial.
	 */
	private static final long serialVersionUID = -5981315841189614217L;
	
	@Id
	@Column(name = "id")
    private int id;
}
