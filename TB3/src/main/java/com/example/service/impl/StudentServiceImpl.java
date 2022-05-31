package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student getOneById(Long IdStudent) {
		return studentRepository.findById(IdStudent).orElseThrow(() -> new RuntimeException("Student Not Found!"));
	}

	@Override
	public Long create(Student entity) {
		studentRepository.save(entity);
		return entity.getIdStudent();
	}

	@Override
	public void update(Long IdStudent, Student entity) {
		Student currentStudent = getOneById(IdStudent);
		currentStudent.setFirstName(entity.getFirstName());
		currentStudent.setLastName(entity.getLastName());
		currentStudent.setDni(entity.getDni());
		currentStudent.setEmail(entity.getEmail());
		currentStudent.setRubro(entity.getRubro());
		currentStudent.setCategoria(entity.getCategoria());
		currentStudent.setNumero(entity.getNumero());
		currentStudent.setContrasenia(entity.getContrasenia());

		studentRepository.save(currentStudent);
	}

	@Override
	public void delete(Long IdStudent) {
		studentRepository.deleteById(IdStudent);
	}

}