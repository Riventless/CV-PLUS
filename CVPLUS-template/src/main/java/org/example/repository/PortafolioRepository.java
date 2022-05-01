package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Portafolio;

@Named
public class PortafolioRepository implements Serializable{

	
	 
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="demoWeb")	
	private EntityManager em;
	
	public List<Portafolio> findAll()throws Exception{
		
		List<Portafolio> portafolios=new ArrayList<>();
		
		TypedQuery<Portafolio> query=em.createQuery("SELECT po FROM Portafolio po",Portafolio.class);
		portafolios=query.getResultList();
		return portafolios;
	}

}
