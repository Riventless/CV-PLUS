package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	@Query("SELECT count(d) FROM Student d  WHERE d.dni=?1")
	int verificarExistenciaEstudiante(String dni);
	
	@Query("SELECT d FROM Doctor d  WHERE d.dni=?1")
	List<Student> buscarStudent(String dni);
}
