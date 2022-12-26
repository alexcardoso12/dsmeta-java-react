package com.odensys.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odensys.dsmeta.entities.Sales;
import com.odensys.dsmeta.repositories.SaleRepository;

@Service
public class SalesService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sales> findsales(){
		return repository.findAll();
	}
}
