package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Portafolio;
import com.example.repository.PortafolioRepository;



@Service
public class PortafolioService implements com.example.service.PortafolioService2{

	@Autowired
	private PortafolioRepository portafolioRepository;
	

	@Override
	public List<Portafolio> getAll() throws Exception {
		// TODO Auto-generated method stub
		return portafolioRepository.findAll();
	}

	@Override
	public Portafolio getOneById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long create(Portafolio entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id, Portafolio entity) throws Exception {
		
		
	}

	@Override
	public void delete(Long id) throws Exception {
		portafolioRepository.deleteById(id);
		
	}

	@Override
	public Portafolio saveOrUpdate(Portafolio entity) throws Exception {
		// TODO Auto-generated method stub
		return portafolioRepository.save(entity);
	}

	@Override
	public Optional<Portafolio> getOne(Long id) throws Exception {
		// TODO Auto-generated method stub
		return portafolioRepository.findById(id);
	}

	@Override
	public List<Portafolio> getPortafolioById(Long id) throws Exception {
		
		return portafolioRepository.findByIdPortafolio(id);
	}



	@Override
	public List<Portafolio> getPortafolioByName(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return portafolioRepository.findByTitleContaining(nombre);
	}

    
	public List<Portafolio>getAllPortafolios(){
		return portafolioRepository.findAllSortByName();
		
	}
	
	

	
	
}
