package com.example.controller;


import com.example.entities.Student;
import com.example.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estudiantes")
public class StudentController {

	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
	this.studentService=studentService;
	}
	
	@GetMapping
	public String homee(Model model) {
		model.addAttribute("students",studentService.getAllStudent());
		model.addAttribute("student",studentService.getAllStudent());
		return "estudiantes/list";
	}
	
	@PostMapping("/buscar")
	public String buscarStudent(Model model, @ModelAttribute Student student) {		
		model.addAttribute("student",studentService.buscarStudentByFirstName(student.getFirstName()));
		return "estudiantes/list";
	}
	
}
