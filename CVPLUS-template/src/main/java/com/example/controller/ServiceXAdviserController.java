package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Adviser;
import com.example.entities.Servicio;
import com.example.entities.ServicioXAdviser;
import com.example.service.AdviserService;
import com.example.service.ServicioService;
import com.example.service.ServicioXAdviserService;


@Controller
@RequestMapping("/views/advisers")
public class ServiceXAdviserController {

	@Autowired
	private  ServicioXAdviserService sxaService;
	
	
	@Autowired 
	private ServicioService servicioService;
	  
	@Autowired
	private AdviserService adviserService;
	 
	
	/*
	 * private ServicioXAdviserService advisoryservice; private
	 * ServicioXAdviserService sxa_service; private List<ServicioXAdviserRepository> sxa_list
	 * = new ArrayList<>();
	 * 
	 * public ServiceXAdviserController(ServicioXAdviserService sxaservice,
	 * ServicioXAdviserService servicioxadviserservice) { this.advisoryservice =
	 * advisoryservice; this.sxa_service = servicioxadviserservice; }
	 */
    
    @GetMapping("/")
	public String showAllSxA(Model model) { 
		model.addAttribute("sxa_collection", sxaService.getAllSxA());
		return "/views/advisers/list"; 
	}
    
	
	  @GetMapping("/new")
	  public String saveSxA(Model model) {
		  
		  ServicioXAdviser sxa = new ServicioXAdviser();
		  List<Adviser> listAdvisers = adviserService.getAllAdvisers();
		  List<Servicio> listServices = servicioService.getAllServices();
		  
		  model.addAttribute("titulo", "Registro de servicios por asesor");
		  model.addAttribute("sxa", sxa);
		  model.addAttribute("advisers", listAdvisers);
	  	  model.addAttribute("services", listServices);
		  return "/views/advisers/form"; 
	}
	  
	  
		
	  @PostMapping("/save") 
	  public String saveAdvisory(@ModelAttribute ServicioXAdviser sxa)  { 
		  //ServicioXAdviserService sxaService)
		  sxaService.saveSxA(sxa);
	  	return "redirect:/views/advisers/"; 
	  
	  }
		 
	 
	  @GetMapping("/edit/{id}")
	  public String editSxA(@PathVariable("id") Long idsxa, Model model) {
		  
		  ServicioXAdviser sxa = sxaService.FindById(idsxa);
		  List<Adviser> listAdvisers = adviserService.getAllAdvisers();
		  List<Servicio> listServices = servicioService.getAllServices();
		  
		  model.addAttribute("titulo", "Editar servicios del asesor");
		  model.addAttribute("sxa", sxa);
		  model.addAttribute("advisers", listAdvisers);
	  	  model.addAttribute("services", listServices);
		  return "/views/advisers/form"; 
	}
	  
	
	  @GetMapping("/delete/{id}")
	  public String deleteSxA(@PathVariable("id") Long idsxa) {
		  
		  sxaService.DeleteSxA(idsxa);
		  
		  return "redirect:/views/advisers/"; 
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
