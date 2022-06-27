package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Advisory;
import com.example.repository.AdvisoryRepository;

@Service
public class AdvisoryService {
	
	@Autowired
	private AdvisoryRepository advisoryrepository;
	
	
	public List<Advisory> getAllAdvisory() {
		return (List<Advisory>) advisoryrepository.findAll();
	}
	

	public void saveAdvisory(Advisory advisory) {
//		int existAdvisory=advisoryrepository.verificarExistenciaAdvisory(advisory.getIdAsesoria());
		
//		if(existAdvisory==0)
		advisoryrepository.save(advisory);
		
		
//		return existeAdvisory;
	}
	
	public Optional<Advisory> findAdvisoryById(Long id) {
        return advisoryrepository.findById(id);
    }

    
	
	public void delete(Long id) {
		 advisoryrepository.deleteById(id); 
	
	}
	
	
	 
	public void update(Advisory advisory) throws Exception{
		advisoryrepository.save(advisory);
	  
	}
	  
	  
	 
}