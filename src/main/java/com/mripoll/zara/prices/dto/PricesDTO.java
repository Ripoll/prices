package com.mripoll.zara.prices.dto;

import lombok.Data;

@Data
public class PricesDTO {
	
	private Integer brandId;

	private String startDate;
	
	private String endDate;
	
	private Integer priceList;
	
	private Integer productId;
	
	private Double price;
	
}
