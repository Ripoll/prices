package com.mripoll.zara.prices.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "prices")
public class PricesEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "PRICES_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pricesId;
	
	@Column(name = "BRAND_ID")
	private Integer brandId;
	
	@Column(name = "START_DATE")
	private Timestamp startDate;
	
	@Column(name = "END_DATE")
	private Timestamp endDate;
	
	@Column(name = "PRICE_LIST")
	private Integer priceList;
	
	@Column(name = "PRODUCT_ID")
	private Integer productId;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "CURR")
	private String curr;

}
