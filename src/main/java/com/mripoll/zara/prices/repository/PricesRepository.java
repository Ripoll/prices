package com.mripoll.zara.prices.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mripoll.zara.prices.domain.PricesEntity;

public interface PricesRepository extends JpaRepository<PricesEntity, Integer>{
		
	List<PricesEntity> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqualAndBrandIdAndProductIdOrderByPriorityDesc(Timestamp fechaIni,Timestamp fechaFin, Integer brand_id, Integer product_id);

}
