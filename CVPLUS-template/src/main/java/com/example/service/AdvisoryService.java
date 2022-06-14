package com.example.service;

import java.util.List;

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
	
	public Advisory findAdvisoryById(Long id) {
        return advisoryrepository.findById(id).orElse(null);
    }

    
    public Advisory updateAdvisory(Advisory student) {
        return advisoryrepository.save(student);
    }
	
	public void delete(Long id) {
		 advisoryrepository.deleteById(id); 
	
	}
	
	
	
	 /*
	 public Object ServiciogetOneById(Long id) throws Exception{ return
	 service_adviserRepository.findById(id).orElseThrow(() -> new
	 RuntimeException("ServicioNot Found!")); }
	  
	 * @Override public Long create(Servicioentity) throws Exception{
	 * service_adviserRepository.save(entity); return entity.getId(); }
	 * 
	 * @Override public void update(Long id, Servicioentity) throws Exception{
	 * ServiciocurrentServicio= getOneById(id);
	 * currentBook.setTitle(entity.getTitle());
	 * currentBook.setAuthor(entity.getAuthor());
	 * currentBook.setCategories(entity.getCategories());
	 * currentBook.setDescription(entity.getDescription());
	 * currentBook.setDateField(entity.getDateField());
	 * service_adviserRepository.save(currentBook); }
	 * 
	 * 
	 */
}