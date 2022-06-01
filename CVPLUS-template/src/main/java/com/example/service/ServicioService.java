package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Advisory;
import com.example.entities.ServicioXAdviser;
import com.example.repository.AdvisoryRepository;
import com.example.repository.ServicioXAdviserRepository;

@Service
public class ServicioService {
	
	@Autowired
	private ServicioXAdviserRepository sxarepository;
	
	public List<ServicioXAdviser> getAllServices() {
		return sxarepository.findAll();
	}
}
