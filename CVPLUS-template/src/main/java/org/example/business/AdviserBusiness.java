package org.example.business;
import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Adviser;
import org.example.repository.AdviserRepository;


@Named
public class AdviserBusiness implements Serializable  {

		private static final long serialVersionUID = 1L;
		@Inject
		private AdviserRepository advisorRepository;
		@Transactional
		 /* insertar */ 
		 public Long insert(Adviser adviser) throws Exception
		 {
			return adviserRepository.insert(adviser);
		 }
		 /* actualizar */ 
		@Transactional
		 public Long update(Adviser adviser) throws Exception
		 {
			return adviserRepository.update(adviser);
		 }
		 /* buscar todos */ 
		 public List<Adviser> getAll()	throws Exception
		 {
			return adviserRepository.findAll()	;
		 }
		 /* Buscar x nombre de empresa */ 
		 public List<Adviser> getAdviserByName(String FirstName)	throws Exception
		 {
			return adviserRepository.findByName(FirstName)	;
		 }
	}
}
