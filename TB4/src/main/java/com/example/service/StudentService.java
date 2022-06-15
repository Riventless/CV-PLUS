package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entities.Student;


public interface StudentService {
	public Integer insertar(Student student);

	public void modificar(Student student);

	public void eliminar(Long IdStudent);

	Optional<Student> listarId(Long IdStudent);

	List<Student> listar();

	List<Student> BuscarPorDni(String Dni);
	
}
