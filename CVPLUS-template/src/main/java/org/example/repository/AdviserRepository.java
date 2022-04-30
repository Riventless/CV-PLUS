package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Adviser;

public class AdviserRepository implements Serializable{
	private static final long serialVersionUID = 1L;
	 @PersistenceContext(unitName="demoWeb")
	 private EntityManager em;
	 
   /*buscar todos */
	 
	 public List<Adviser> findAll()throws Exception
	 {
		 List<Adviser> adviser = new ArrayList<>();
			TypedQuery<Adviser> query=em.createQuery("FROM Adviser b", Adviser.class);
			adviser=query.getResultList();
			return adviser; 
	 }
	 /* buscar por nombre*/ 
	 public List<Adviser> findByName(String Nombre_Asesor)throws Exception
	 {
		List<Adviser> adviser = new ArrayList<>();
		TypedQuery<Adviser> query=em.createQuery("FROM Adviser b WHERE b.FirstName ?1", Adviser.class);
		query.setParameter(1, "%"+Nombre_Asesor+"%");
		adviser=query.getResultList();
		return adviser; 
	 }
	
	 /* insertar */ 
	 public Long insert(Adviser adviser) throws Exception
	 {
		 em.persist(adviser);
		 return adviser.getIdAdviser();
		 
	 }
	 /* actualizar */ 
	 public Long update(Adviser adviser) throws Exception
	 {
		 em.merge(adviser);
		 return adviser.getIdAdviser();
	 }

}
