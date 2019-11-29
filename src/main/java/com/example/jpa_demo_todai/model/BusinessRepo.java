package com.example.jpa_demo_todai.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BusinessRepo extends JpaRepository<Business, String> {

}
