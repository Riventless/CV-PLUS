package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Business;

@Named
public class BusinessRepository implements Serializable

{

	private static final long serialVersionUID = 1L;
	 @PersistenceContext(unitName="demoWeb")
	 private EntityManager em;
	 
	 
	 
    /*buscar todos */
	 
	 public List<Business> findAll()throws Exception
	 {
		 List<Business> business = new ArrayList<>();
			TypedQuery<Business> query=em.createQuery("FROM Business b", Business.class);
			business=query.getResultList();
			return business; 
	 }
	 /* buscar por nombre*/ 
	 public List<Business> findByName(String Nombre_Empresa)throws Exception
	 {
		List<Business> business = new ArrayList<>();
		TypedQuery<Business> query=em.createQuery("FROM Business b WHERE b.Nombre_Empresa ?1", Business.class);
		query.setParameter(1, "%"+Nombre_Empresa+"%");
		business=query.getResultList();
		return business; 
	 }
	
	 /* insertar */ 
	 public Long insert(Business business) throws Exception
	 {
		 em.persist(business);
		 return business.getIdEmpresa();
	 }
	 /* actualizar */ 
	 public Long update(Business business) throws Exception
	 {
		 em.merge(business);
		 return business.getIdEmpresa();
	 }

}
