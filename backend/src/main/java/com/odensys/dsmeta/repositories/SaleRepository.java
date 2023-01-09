package com.odensys.dsmeta.repositories;

import java.awt.print.Pageable;
import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.odensys.dsmeta.entities.Sales;

public interface SaleRepository extends JpaRepository<Sales, Long> {
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sales> findSales(LocalDate min, LocalDate max, Pageable pageable);

}
