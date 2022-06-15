package com.example.repository;

import java.util.List;

import com.example.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Long>{
	@Query("FROM Student s ORDER BY nombre ASC")
	List<Student> findAllSortByName();
	@Query("FROM Student s ORDER BY id ASC")
	List<Student> findAllSortById();
	@Query("FROM Student s ORDER BY dni DESC")
	List<Student> findAllSortByValoracion();
	
	@Query("SELECT count(s) FROM Student s  WHERE s.firstName=?1")
	List<Student> buscarStudent(String firstName);
}
