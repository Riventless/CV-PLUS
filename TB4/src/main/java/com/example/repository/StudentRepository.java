package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	@Query("SELECT count(d) FROM Student d  WHERE d.Dni=?1")
	int verificarExistenciaStudent(String Dni);
	
	@Query("SELECT d FROM Student d  WHERE d.Dni=?1")
	List<Student> buscarStudent(String Dni);
	
	@Modifying(clearAutomatically = true)
	@Query("update Student set FirstName = :FirstName ,LastName = :LastName, Email = "
			+ ":Email,Dni = :Dni,Rubro = "
			+ ":Rubro, Categoria = :Categoria, Numero = "
			+ ":Numero, Contrasenia = :Contrasenia  where IdStudent=:IdStudent")
	
	public void actualizar(@Param("FirstName") String FirstName,
			@Param("LastName") String LastName, @Param("Email") String Email,
			@Param("Dni") String Dni, @Param("Rubro") String Rubro,
			@Param("Categoria") Boolean Categoria, @Param("Numero") Long Numero,
			@Param("Contrasenia") String Contrasenia, @Param("IdStudent") Long IdStudent);

	
}
