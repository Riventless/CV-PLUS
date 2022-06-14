package com.example.controller;

<<<<<<< Updated upstream
import com.example.entities.Portafolio;
import com.example.service.EmpresaService;
import com.example.service.PortafolioService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portafolios")
public class PortafolioController {
	
	private EmpresaService empresaService;
	private PortafolioService portafolioService;
	
	public PortafolioController(EmpresaService empresaService,PortafolioService portafolioService) {
		this.empresaService=empresaService;
		this.portafolioService=portafolioService;
	}
=======
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.entities.Portafolio;
import com.example.entities.Proyecto;
import com.example.service.PortafolioService2;
import com.example.service.PortafolioService1;

@Controller
@SessionAttributes("portafolio")
@RequestMapping("/portafolios")
public class PortafolioController {

	@Autowired
	private PortafolioService2 portafolioService;
	
	@Autowired
	private PortafolioService1 portafolioService1;
>>>>>>> Stashed changes
	
	
	@GetMapping
	public String home(Model model) {
<<<<<<< Updated upstream
		model.addAttribute("portafolios",portafolioService.getAllPortafolios());
		return "portafolios/list";
	}
	
	
	@GetMapping("/comment/{id}")
	public String commentPortafolioForm(@PathVariable("id")long id,Model model) {
		Portafolio portafolio=portafolioService.getPortafolioById(id);
		System.out.println(portafolio.getNombre());
		model.addAttribute("portafolio",portafolio);
		return "portafolios/comment";
	}
	
	@GetMapping("/visual/{id}")
	public String visualPortafolioForm(@PathVariable("id")long id,Model model) {
		Portafolio portafolio=portafolioService.getPortafolioById(id);
		System.out.println(portafolio.getNombre());
		model.addAttribute("portafolio",portafolio);
		return "portafolios/visual";
	}
	
	
	@PostMapping("/update/{id}")
	public String updateEvaluacionPortafolio(@PathVariable("id") long id,Portafolio portafolio) {
		portafolioService.update(id,portafolio);
		
		return "redirect:/portafolios";
=======
		model.addAttribute("portafolio", new Portafolio());
		model.addAttribute("portafolios",portafolioService1.getAllPortafolios());
		return "portafolios/list";
	}
	
	@GetMapping("/list")
	public String getAllPortafolios(Model model) {
		model.addAttribute("portafolio", new Portafolio());
		model.addAttribute("portafolios",portafolioService1.getAllPortafolios());
		try {
			List<Portafolio>portafolios=portafolioService.getAll();
			model.addAttribute("portafolios",portafolios);
			model.addAttribute("portafolios",portafolioService1.getAllPortafolios());
			model.addAttribute("proyecto", new Proyecto());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "portafolios/list";
		
	}
	
	@GetMapping("/form")
	public String formPortafolio(Model model) {
		Portafolio portafolio=new Portafolio();
		model.addAttribute("portafolio",portafolio);
		model.addAttribute("tittle","Nuevo Portafolio");
		return "portafolios/form";
		
	}
	
	@PostMapping("/save")
	public String savePortafolio(@Valid Portafolio portafolio, BindingResult result,Model model,
			SessionStatus status) {
		
		try {
			if(result.hasErrors()) {
				return "portafolios/form";
			}
			portafolioService.saveOrUpdate(portafolio);
			status.setComplete();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/portafolios/list";
>>>>>>> Stashed changes
	}
	

	
<<<<<<< Updated upstream
=======
	@GetMapping("/{id}")
    public String deletePortafolio(@PathVariable Long id) throws Exception {
        portafolioService.delete(id);
        return "redirect:/portafolios/list";
    }
	
	 @PostMapping("/buscar")
	 public String buscarPortafolio(Model model,@ModelAttribute Portafolio portafolio) {
		 model.addAttribute("portafolios",portafolioService1.buscarPortafolioPorNombre(portafolio.getNombrePortafolio()));
		 return "portafolios/list";
	 }
	
>>>>>>> Stashed changes
	
}
