package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Student;
import com.example.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
    public String showAllStudents(Model model) {
        model.addAttribute("students", studentService.getAll());
        return "students/listaStudents";
    }
	
	@GetMapping("/new")
    public String newStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/new";
    }
	@PostMapping("/save")
    public String saveNewStudent(Student student) {
        long IdStudent = studentService.create(student);
        return "redirect:/students/";
       
    }
	
	@GetMapping("/edit/{IdStudent}")
    public String editStudentForm(@PathVariable("IdStudent") long IdStudent, Model model) {
        Student student =  studentService.getOneById(IdStudent);
        model.addAttribute("student", student);
        return "students/edit";
    }

	@PostMapping("/update/{IdStudent}")
    public String updateStudent(@PathVariable("IdStudent") long IdStudent, Student student) {
        studentService.update(IdStudent, student);
        return "redirect:/students/";    
    }

	

	
}
