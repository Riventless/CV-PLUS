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

import com.example.entities.Portafolio;
import com.example.entities.Proyecto;
import com.example.service.ProyectoService;
import com.example.service.impl.PortafolioService;

@Controller
@RequestMapping("/proyectos")
public class ProyectoController {
	
	@Autowired
	private ProyectoService proyectoService;
	
	@Autowired
	private PortafolioService portafolioService;
	
	private List<Portafolio> portafolioList=new ArrayList<>();
	
	public ProyectoController(ProyectoService proyectoService,PortafolioService portafolioService) {
		
		this.proyectoService=proyectoService;
		this.portafolioService=portafolioService;
		
	}
	
	@GetMapping
	public String home(Model model) {
		 model.addAttribute("proyecto", new Proyecto());
		model.addAttribute("proyectos",proyectoService.getAllProyectos());
		return "proyectos/proyectos";
	}
	
	
	 @GetMapping("/proyectos")
	    public String listProyectos(Model model) {
		    model.addAttribute("proyecto", new Proyecto());
	        model.addAttribute("proyectos", proyectoService.getAllProyectos());
	        return "proyectos";
	    }
	 
	 




}
