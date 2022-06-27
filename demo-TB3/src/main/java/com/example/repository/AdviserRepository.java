package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Adviser;

@Repository
public interface AdviserRepository extends CrudRepository<Adviser, Long> {
	
    
}

