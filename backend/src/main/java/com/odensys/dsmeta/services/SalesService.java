package com.odensys.dsmeta.services;

import java.awt.print.Pageable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.odensys.dsmeta.entities.Sales;
import com.odensys.dsmeta.repositories.SaleRepository;

@Service
public class SalesService {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<Sales> findSales(String minDate, String maxDate, Pageable pageable){
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return repository.findSales(min, max, pageable);
	}
}
