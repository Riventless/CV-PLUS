package com.example.controller;

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
	
	
	@GetMapping
	public String home(Model model) {
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
	}
	
	@PostMapping("/update/{id}")
	public String updatePortafolio(@Valid Portafolio portafolio, BindingResult result,Model model,
			SessionStatus status) {
		
		try {
			if(result.hasErrors()) {
				return "portafolios/edit_portafolio";
			}
			portafolioService.saveOrUpdate(portafolio);
			status.setComplete();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/portafolios/list";
	}
	
	
	//@GetMapping("/edit/{id}")
  //  public String editPortafolioForm(@PathVariable("id") long id, Model model) throws Exception {
	//	List<Portafolio>portafolios=portafolioService.getPortafolioById(id);
//		model.addAttribute("portafolio",portafolios);
  //      return "portafolios/edit_portafolio";
  //  }
	
	
	@GetMapping("/edit/{id}")
    public String editPortafolioForm(@PathVariable("id") long id, Model model) {
        Portafolio portafolio = portafolioService1.getSPortafolioById(id);
        model.addAttribute("portafolio", portafolio);
        return "portafolios/edit_portafolio";
    }
	
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
	
	
}
