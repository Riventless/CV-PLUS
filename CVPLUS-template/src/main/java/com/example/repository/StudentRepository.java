package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("SELECT count(e) FROM Student e  WHERE e.Dni=?1")
	int verificarExistenciaStudent(String Dni);
	
	@Query("SELECT e FROM Student e  WHERE e.Dni=?1")
	List<Student> buscarStudentPorDni(String Dni);
	
}
