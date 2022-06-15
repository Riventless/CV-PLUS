package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
	@Transactional
	public Integer insertar(Student student) {
		int rpta=studentRepository.verificarExistenciaStudent(student.getDni());
		if(rpta==0) {studentRepository.save(student);
		}
		return rpta;
	}


	@Override
	public void modificar(Student student) {
	studentRepository.actualizar(student.getFirstName(),
			student.getLastName(),student.getEmail(),
			student.getDni(),student.getRubro(),
			student.getCategoria(),student.getNumero(),
			student.getContrasenia(),student.getIdStudent());
	}


	@Override
	public void eliminar(Long IdStudent) {
		studentRepository.deleteById(IdStudent);
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public Optional<Student> listarId(Long IdStudent) {
		// TODO Auto-generated method stub
		
		return studentRepository.findById(IdStudent);
	}

	@Override
	public List<Student> listar() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public List<Student> BuscarPorDni(String Dni) {
		// TODO Auto-generated method stub
		
		return studentRepository.buscarStudent(Dni);
	}

}