package com.odensys.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odensys.dsmeta.entities.Sales;
import com.odensys.dsmeta.services.SalesService;

@RestController
@RequestMapping (value = "/sales")
public class SaleController {

	@Autowired
	private SalesService service;
	
	@GetMapping
	public List<Sales> findSales(){
		return service.findsales();
	}
	
	
}
