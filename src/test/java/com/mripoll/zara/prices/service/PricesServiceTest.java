package com.mripoll.zara.prices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mripoll.zara.prices.dto.PricesDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricesServiceTest {
	
	@Autowired
	private PricesService pricesService;
	
	@Test
	public void prueba1() throws Exception { //Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA) 

		PricesDTO resultado = pricesService.getPrices(1, 35455, Timestamp.valueOf("2020-06-14 10:00:00"));
		
		Integer correctBrand = 1;
		Integer correctPriceList = 1;
		Integer correctProductId = 35455;
		Double correctPrice = Double.valueOf("35.50");
		String correctStartDate= ("2020-06-14 00:00:00");
		String correctEndDate= ("2020-12-31 23:59:59");

		assertEquals(resultado.getBrandId(), correctBrand);
		assertEquals(resultado.getPriceList(), correctPriceList);
		assertEquals(resultado.getProductId(), correctProductId);
		assertEquals(resultado.getPrice(), correctPrice);
		assertEquals(resultado.getStartDate(), correctStartDate);
		assertEquals(resultado.getEndDate(), correctEndDate);
	}
	
	@Test
	public void prueba2() throws Exception { //Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
		
		PricesDTO resultado = pricesService.getPrices(1, 35455, Timestamp.valueOf("2020-06-14 16:00:00"));
		
		Integer correctBrand = 1;
		Integer correctPriceList = 2;
		Integer correctProductId = 35455;
		Double correctPrice = Double.valueOf("25.45");
		String correctStartDate = "2020-06-14 15:00:00";
		String correctEndDate = "2020-06-14 18:30:00";
		
		assertEquals(resultado.getBrandId(), correctBrand);
		assertEquals(resultado.getPriceList(), correctPriceList);
		assertEquals(resultado.getProductId(), correctProductId);
		assertEquals(resultado.getPrice(), correctPrice);
		assertEquals(resultado.getStartDate(), correctStartDate);
		assertEquals(resultado.getEndDate(), correctEndDate);
	}
	
	@Test
	public void prueba3() throws Exception { //Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
		
		PricesDTO resultado = pricesService.getPrices(1, 35455, Timestamp.valueOf("2020-06-14 21:00:00"));

		Integer correctBrand = 1;
		Integer correctPriceList = 1;
		Integer correctProductId = 35455;
		Double correctPrice = Double.valueOf("35.50");
		String correctStartDate= ("2020-06-14 00:00:00");
		String correctEndDate= ("2020-12-31 23:59:59");
		
		assertEquals(resultado.getBrandId(), correctBrand);
		assertEquals(resultado.getPriceList(), correctPriceList);
		assertEquals(resultado.getProductId(), correctProductId);
		assertEquals(resultado.getPrice(), correctPrice);
		assertEquals(resultado.getStartDate(), correctStartDate);
		assertEquals(resultado.getEndDate(), correctEndDate);
	}
	
	@Test
	public void prueba4() throws Exception { //Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)
				
		PricesDTO resultado = pricesService.getPrices(1, 35455, Timestamp.valueOf("2020-06-15 10:00:00"));

		Integer correctBrand = 1;
		Integer correctPriceList = 3;
		Integer correctProductId = 35455;
		Double correctPrice = Double.valueOf("30.50");
		String correctStartDate= ("2020-06-15 00:00:00");
		String correctEndDate= ("2020-06-15 11:00:00");

		assertEquals(resultado.getBrandId(), correctBrand);
		assertEquals(resultado.getPriceList(), correctPriceList);
		assertEquals(resultado.getProductId(), correctProductId);
		assertEquals(resultado.getPrice(), correctPrice);
		assertEquals(resultado.getStartDate(), correctStartDate);
		assertEquals(resultado.getEndDate(), correctEndDate);
	}
	
	@Test
	public void test5() throws Exception { //Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)

		PricesDTO resultado = pricesService.getPrices(1, 35455, Timestamp.valueOf("2020-06-16 21:00:00"));
		
		Integer correctBrand = 1;
		Integer correctPriceList = 4;
		Integer correctProductId = 35455;
		Double correctPrice = Double.valueOf("38.95");
		String correctStartDate= ("2020-06-15 16:00:00");
		String correctEndDate= ("2020-12-31 23:59:59");
		
		assertEquals(resultado.getBrandId(), correctBrand);
		assertEquals(resultado.getPriceList(), correctPriceList);
		assertEquals(resultado.getProductId(), correctProductId);
		assertEquals(resultado.getPrice(), correctPrice);
		assertEquals(resultado.getStartDate(), correctStartDate);
		assertEquals(resultado.getEndDate(), correctEndDate);
	}
	
}
