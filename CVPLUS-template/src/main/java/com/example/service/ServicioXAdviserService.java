package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.entities.ServicioXAdviser;
import com.example.repository.ServicioXAdviserRepository;

@Service
public class ServicioXAdviserService {
	
	@Autowired
	private ServicioXAdviserRepository service_adviserRepository;
	
	
	
	public List<ServicioXAdviser> getAllSxA() {
		return service_adviserRepository.findAll();
	}
	
	
	
	
	
	
	
	/*
	 * public List<Servicio> getServiceAdvisersByName() { return
	 * service_adviserRepository.findByNameContaining(adviser.firstname,
	 * adviser.lastname); }
	 */
	
	/*
	 * public List<Servicio> getServiceAdvisersByState() { return
	 * service_adviserRepository.findByStateContaining(Estado); }
	 */
	
	
	
}
