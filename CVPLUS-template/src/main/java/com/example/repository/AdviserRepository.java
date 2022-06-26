package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Adviser;

public interface AdviserRepository extends JpaRepository<Adviser, Long> {

	@Query("SELECT count(e) FROM Adviser e  WHERE e.Dni_As=?1")
	int verificarExistenciaAdviser(String Dni_As);
	
	@Query("SELECT e FROM Adviser e  WHERE e.Dni_As=?1")
	List<Adviser> buscarAdviserPorDNI(String Dni_As);
}
