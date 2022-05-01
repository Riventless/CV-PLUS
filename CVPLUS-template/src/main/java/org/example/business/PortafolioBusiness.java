package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.example.entities.Portafolio;
import org.example.repository.PortafolioRepository;




@Named
public class PortafolioBusiness implements Serializable{

    private static final long serialVersionUID = 1L;

    @Inject
    private PortafolioRepository portafolioRepository;
    
    public List<Portafolio> getAllPortafolios()throws Exception{
    	return portafolioRepository.findAll();
    	
    	
    }

}
