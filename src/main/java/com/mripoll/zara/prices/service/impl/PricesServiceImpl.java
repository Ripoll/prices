package com.mripoll.zara.prices.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mripoll.zara.prices.domain.PricesEntity;
import com.mripoll.zara.prices.dto.PricesDTO;
import com.mripoll.zara.prices.mapper.PricesMapper;
import com.mripoll.zara.prices.repository.PricesRepository;
import com.mripoll.zara.prices.service.PricesService;
import com.mripoll.zara.prices.utils.PricesConstants;

@Service
@Transactional
public class PricesServiceImpl implements PricesService {
	
	private PricesMapper pricesMapper = Mappers.getMapper(PricesMapper.class);
	
	@Autowired
	private PricesRepository pricesRepo;

	@Override
	public PricesDTO getPrices(Integer brandId, Integer productId, Timestamp date) throws Exception {
		PricesDTO result = new PricesDTO();
		List<PricesEntity> prices = pricesRepo.findAllByStartDateLessThanEqualAndEndDateGreaterThanEqualAndBrandIdAndProductIdOrderByPriorityDesc(date,date,brandId,productId);
		
		if(prices.size()>0 && prices.size()<=2) {
			result = pricesMapper.pricesEntityToPricesDto(prices.get(0));
		}else if(prices.size()>2) {
			throw new Exception(PricesConstants.EX_DB_CONF);
		}else if (prices.isEmpty()) {
			throw new Exception(PricesConstants.EX_PARAM_NOT_CONF);
		}
		return result;
	}

}
