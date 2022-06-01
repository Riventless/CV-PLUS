package com.example.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Advisory;


@Repository
public interface AdvisoryRepository extends JpaRepository<Advisory, Long> {
	
	/*
	 * @Query("FROM Advisory ad") public List<Advisory> findAllAdvisory();
	 */
	 
}