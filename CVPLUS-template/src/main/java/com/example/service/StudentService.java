package com.example.service;

import java.util.List;

import com.example.entities.Student;
import com.example.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}
	
	public List<Student> getAllStudentByName(){
		return studentRepository.findAllSortByName();
	}
	
	public List<Student> getAllStudentByValoracion(){
		return studentRepository.findAllSortByValoracion();
	}
	
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	public List<Student> buscarStudentByFirstName(String firstName){
		List<Student> students=studentRepository.buscarStudent(firstName);
		return students;
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudentByid(Long id) {
		return studentRepository.findById(id).get();
	}
	
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
}
