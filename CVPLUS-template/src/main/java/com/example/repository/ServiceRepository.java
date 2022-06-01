package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Servicio;

public interface ServiceRepository  extends JpaRepository<Servicio, Long> {
	
	 @Query("FROM Servicio sa ORDER BY Estado ASC")
	 public List<Servicio> findAllAdvisorSortByType();
	    
		
		/*
		 * @Query("SELECT Distinct sa FROM Servicio sa WHERE sa.adviser.firstName=?1 AND sa.adviser.lastName=?2"
		 * ) public List<Servicio> findByNameContaining(String name, String lastname);
		 * 
		 * 
		 * @Query("FROM Servicio sa WHERE sa.Estado=?1") public List<Servicio>
		 * findByStateContaining(String state);
		 */
		 
}


