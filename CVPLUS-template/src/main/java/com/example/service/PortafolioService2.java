package com.example.service;

import java.util.List;

import com.example.entities.Portafolio;

public interface PortafolioService2 extends CrudService<Portafolio, Long>{

	List<Portafolio>getPortafolioById(Long id)throws Exception;
	
	List<Portafolio>getPortafolioByName(String nombre)throws Exception;
	
}
