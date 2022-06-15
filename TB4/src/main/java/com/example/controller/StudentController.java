package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.entities.Student;
import com.example.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/list")
    public String showAllStudents(Model model) {
		try {
		List<Student> students=studentService.listar();
		model.addAttribute("students",students);
		
		}catch (Exception e) {
			e.printStackTrace();
			
		}	
		
			return "students/list";
    }
	
	@GetMapping("/new")
    public String newStudentForm(Model model) {
		Student student=new Student();
        model.addAttribute("student", student);
        model.addAttribute("title","Nuevo Estudiante");
        return "students/new";
    }
	@PostMapping("/save")
    public String saveStudent(@Valid Student student, BindingResult result,Model model) {
		long IdStudent;
		try {
		
		if(result.hasErrors()) 
		{  
			return "students/new";
		}else
			IdStudent=studentService.insertar(student);
			model.addAttribute("mensaje", "Se registro nuevo estudiantes");			
		
	}catch (Exception e) {	e.printStackTrace();}
		
        return "redirect:/students/list";
       
    }
	
	
	@GetMapping(value ="/edit/{IdStudent}")
    public String editStudentForm(@PathVariable(value="IdStudent") Long IdStudent, Model model, RedirectAttributes flash) {
        Optional<Student> student;
        try {
       
		student = studentService.listarId(IdStudent);
				
        model.addAttribute("student", student);
        model.addAttribute("title", "Editar Estudiante");
        }catch (Exception e) {
        	e.printStackTrace();
        }
        
        return "students/new";
    }
	
	@PostMapping("/update/{IdStudent}")
    public String updateStudent(@PathVariable("IdStudent") long IdStudent, Student student) {
		try {
        studentService.modificar(student);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
        return "redirect:/students/list";    
    }

	@GetMapping("/delete")
    public String eliminarStudent(@RequestParam(value = "idStudent") Long IdStudent, Model model) {

        /// Hacer la eliminación
        studentService.eliminar(IdStudent);
        model.addAttribute("student", new Student());
        model.addAttribute("students", studentService.listar());
        return "redirect:/students/list";
    }

	
}
