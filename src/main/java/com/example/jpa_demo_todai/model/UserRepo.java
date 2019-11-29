package com.example.jpa_demo_todai.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
	
	
	List<User> findByEmployerId(String businessId);
}
