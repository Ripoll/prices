package com.mripoll.zara.prices.service;

import java.sql.Timestamp;

import com.mripoll.zara.prices.dto.PricesDTO;

public interface PricesService {
	
	PricesDTO getPrices(Integer brandId, Integer productId, Timestamp date) throws Exception;

}
