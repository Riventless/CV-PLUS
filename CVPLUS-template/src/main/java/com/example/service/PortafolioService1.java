package com.example.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.entities.Portafolio;
import com.example.repository.PortafolioRepository;



@Service
public class PortafolioService1{

	
	private PortafolioRepository portafolioRepository;
	

	
	public PortafolioService1(PortafolioRepository portafolioRepository) {
		this.portafolioRepository=portafolioRepository;
		
	}
	
	
	public List<Portafolio> getAllPortafolios(){
		return portafolioRepository.findAll();
		
	}
	
	

	public Portafolio getSPortafolioById(Long IdPortafolio) {
		return portafolioRepository.findById(IdPortafolio).get();
		
	}
	
public List<Portafolio>buscarPortafolioPorNombre(String NombrePortafolio){
		
		List<Portafolio> portafolios=portafolioRepository.buscarPortafolio(NombrePortafolio);
		
		return portafolios;
	}



	
	
} 
