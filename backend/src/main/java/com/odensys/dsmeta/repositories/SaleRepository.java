package com.odensys.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odensys.dsmeta.entities.Sales;

public interface SaleRepository extends JpaRepository<Sales, Long> {

}
