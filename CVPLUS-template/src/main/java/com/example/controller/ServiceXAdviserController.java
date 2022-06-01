package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.ServicioXAdviser;
import com.example.service.AdviserService;
import com.example.service.ServicioService;
import com.example.service.ServicioXAdviserService;


@Controller
@RequestMapping("/servicesXadvisories")
public class ServiceXAdviserController {

	@Autowired
	private  ServicioXAdviserService sxaService;
	
	@Autowired
	private ServicioService servicioService;
	
	@Autowired
	private AdviserService advService;
	/*
	 * private ServicioXAdviserService advisoryservice; private
	 * ServicioXAdviserService sxa_service; private List<ServicioXAdviser> sxa_list
	 * = new ArrayList<>();
	 * 
	 * public ServiceXAdviserController(ServicioXAdviserService sxaservice,
	 * ServicioXAdviserService servicioxadviserservice) { this.advisoryservice =
	 * advisoryservice; this.sxa_service = servicioxadviserservice; }
	 */
    
    @GetMapping
	public String showAllSxA(Model model) { 
		model.addAttribute("sxa_collection", sxaService.getAllSxA());
		return "serviceXadviser/list"; 
	}
    
	
	  @GetMapping("/new")
	  public String saveSxA(Model model) {
	  model.addAttribute("sxa", new ServicioXAdviser());
	  model.addAttribute("servicios", servicioService.getAllServices());
//	  model.addAttribute("advisers", servicioService.getAllServices());
	  return "serviceXadviser/form"; }
	  
	  
	
	/*
	 * @PostMapping("/save") public String saveAdvisory(@ModelAttribute("advisory")
	 * ServicioXAdviser advisory) { sxaService.saveAdvisory(advisory); return
	 * "redirect:/advisories"; }
	 */
	 
	
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
