package com.mripoll.zara.prices.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mripoll.zara.prices.domain.PricesEntity;
import com.mripoll.zara.prices.dto.PricesDTO;

@Mapper
public interface PricesMapper {

	@Mapping(source = "startDate", target = "startDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
	@Mapping(source = "endDate", target = "endDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
	PricesDTO pricesEntityToPricesDto(PricesEntity pricesEntity);

}
