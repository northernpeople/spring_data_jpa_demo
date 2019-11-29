package com.example.jpa_demo_todai.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BusinessRepo extends JpaRepository<Business, String> {
	
	
	@Query("select b from Business b JOIN FETCH b.employees where b.id = ?1")
	Business findByIdWithEmployees(String businessId);
}
