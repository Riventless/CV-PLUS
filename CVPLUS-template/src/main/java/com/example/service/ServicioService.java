package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Servicio;
import com.example.repository.ServiceRepository;


@Service
public class ServicioService {
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	public List<Servicio> getAllServices() {
		return (List<Servicio>) serviceRepository.findAll();
	}
}
