package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Business;
import org.example.repository.BusinessRepository;

@Named
public class BusinessNegocio implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private BusinessRepository businessRepository;
	@Transactional
	 /* insertar */ 
	 public Long insert(Business business) throws Exception
	 {
		return businessRepository.insert(business);
	 }
	 /* actualizar */ 
	@Transactional
	 public Long update(Business business) throws Exception
	 {
		return businessRepository.update(business);
	 }
	 /* buscar todos */ 
	 public List<Business> getAll()	throws Exception
	 {
		return businessRepository.findAll()	;
	 }
	 /* Buscar x nombre de empresa */ 
	 public List<Business> getBussinesByName(String Nombre_Empresa)	throws Exception
	 {
		return businessRepository.findByName(Nombre_Empresa)	;
	 }
}
