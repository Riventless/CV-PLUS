package com.example.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.entities.Portafolio;

public interface PortafolioRepository extends JpaRepository<Portafolio, Long> {

	@Query("FROM Portafolio p WHERE p.IdPortafolio like :id")
	List<Portafolio>findByIdPortafolio(@Param("id")Long IdPortafolio);
	
	@Query("FROM Portafolio p WHERE p.NombrePortafolio like :nombre")
    List<Portafolio> findByTitleContaining(@Param("nombre") String nombre);
	
	@Query("FROM Portafolio p WHERE p.NombrePortafolio like :NombrePortafolio")
    List<Portafolio> buscarPortafolio(@Param("NombrePortafolio") String NombrePortafolio);
	
	//@Query("SELECT p FROM Portafolio p  WHERE p.NombrePortafolio=?1")
	//public List<Portafolio> buscarPortafolio(String NombrePortafolio);
	
	
	
	
	@Query("FROM Portafolio p ORDER BY NombrePortafolio ASC")
    public List<Portafolio>findAllSortByName();
    	
	

    	
    

}