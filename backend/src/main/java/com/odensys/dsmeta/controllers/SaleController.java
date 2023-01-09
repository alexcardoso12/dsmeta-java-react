package com.odensys.dsmeta.controllers;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.odensys.dsmeta.entities.Sales;
import com.odensys.dsmeta.services.SalesService;

@RestController
@RequestMapping (value = "/sales")
public class SaleController {

	@Autowired
	private SalesService service;
	
	@GetMapping
	public Page<Sales> findSales(
			@RequestParam(value="minDate", defaultValue= "") String minDate,
			@RequestParam(value="maxDate", defaultValue= "") String maxDate,
			Pageable pageable){
		return service.findSales(minDate, maxDate, pageable);
	}
	
	
}
