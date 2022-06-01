package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Advisory;
import com.example.entities.ServicioXAdviser;
import com.example.service.AdvisoryService;
import com.example.service.ServicioXAdviserService;

@Controller
@RequestMapping("/advisories")
public class AdvisoryController {
	
	private AdvisoryService advisoryservice;
	private ServicioXAdviserService sxa_service;
	private List<ServicioXAdviser> sxa_list = new ArrayList<>();

    public AdvisoryController(AdvisoryService advisoryservice, ServicioXAdviserService servicioxadviserservice) {
        this.advisoryservice = advisoryservice;
        this.sxa_service = servicioxadviserservice;
    }
    
    @GetMapping
	public String showAllAdvisory(Model model) { 
		model.addAttribute("advisory_collection", advisoryservice.getAllAdvisory());
		return "students/list_advisories"; 
	}
    
    @GetMapping("/new")
	public String registrarAdvisory(Model model) {
		model.addAttribute("advisory", new Advisory());
		model.addAttribute("servicioAdviser", sxa_service.getAllSxA().toString());
		return "students/create_advisories";
	}
    
	
	@PostMapping("/save")
	public String saveAdvisory(@ModelAttribute("advisory") Advisory advisory) {
		advisoryservice.saveAdvisory(advisory);
		return "redirect:/advisories";
	}
	
//	public String registrarAdvisory(@Validated @ModelAttribute Advisory doctor, BindingResult result, Model model) {		
//		int rpta;
		
//		if(result.hasErrors()) {
//			model.addAttribute("ciudades", ciudadService.listarCiudades());
//			return "doctor/form";
//		}
		
//		rpta=doctorService.registrarAdvisory(doctor);
//		
//		if(rpta>0) {
//			model.addAttribute("mensaje", "El numero de dni ya existe");
//			model.addAttribute("ciudades", ciudadService.listarCiudades());
//			
//		}else {
//			model.addAttribute("mensaje", "Se registro nuevo doctor");
//			model.addAttribute("doctor",new Advisory());
//			model.addAttribute("ciudades", ciudadService.listarCiudades());			
//		}
//		
//		return "advisory/form";
//	}
}
