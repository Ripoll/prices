package com.mripoll.zara.prices.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mripoll.zara.prices.dto.PricesDTO;
import com.mripoll.zara.prices.service.PricesService;

@RestController("PricesController")
@RequestMapping("/prices")
public class PricesController {
	
	@Autowired
	private PricesService pricesService;
	
	@GetMapping(produces = { "application/json" })
	public PricesDTO prices(
			@RequestParam(name = "brandId", required = true) Integer brandId,
			@RequestParam(name = "productId", required = true) Integer productId,
			@RequestParam(name = "date", required = true) Timestamp date
			) throws Exception{
		return pricesService.getPrices(brandId,productId,date);
	}
	
	@GetMapping(path = "/test1" , produces = { "application/json" })
	public PricesDTO test1() throws Exception{
		Timestamp requestDate = Timestamp.valueOf("2020-06-14 10:00:00");
		Integer requestBrand = 1;
		Integer requestProduct = 35455;
		
		return pricesService.getPrices(requestBrand,requestProduct,requestDate);
	}
	
	@GetMapping(path = "/test2" , produces = { "application/json" })
	public PricesDTO test2() throws Exception{
		Timestamp requestDate = Timestamp.valueOf("2020-06-14 16:00:00");
		Integer requestBrand = 1;
		Integer requestProduct = 35455;
		
		return pricesService.getPrices(requestBrand,requestProduct,requestDate);
	}
	
	@GetMapping(path = "/test3" , produces = { "application/json" })
	public PricesDTO test3() throws Exception{
		Timestamp requestDate = Timestamp.valueOf("2020-06-14 21:00:00");
		Integer requestBrand = 1;
		Integer requestProduct = 35455;
		
		return pricesService.getPrices(requestBrand,requestProduct,requestDate);
	}
	
	@GetMapping(path = "/test4" , produces = { "application/json" })
	public PricesDTO test4() throws Exception{
		Timestamp requestDate = Timestamp.valueOf("2020-06-15 10:00:00");
		Integer requestBrand = 1;
		Integer requestProduct = 35455;
		
		return pricesService.getPrices(requestBrand,requestProduct,requestDate);
	}
	
	@GetMapping(path = "/test5" , produces = { "application/json" })
	public PricesDTO test5() throws Exception{
		Timestamp requestDate = Timestamp.valueOf("2020-06-16 21:00:00");
		Integer requestBrand = 1;
		Integer requestProduct = 35455;
		
		return pricesService.getPrices(requestBrand,requestProduct,requestDate);
	}

}
