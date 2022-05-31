package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.entities.Portafolio;
import com.example.service.PortafolioService2;

@Controller
@SessionAttributes("portafolio")
@RequestMapping("/portafolios")
public class PortafolioController {

	@Autowired
	private PortafolioService2 portafolioService;
	
	
	@GetMapping("/list")
	public String getAllPortafolios(Model model) {
		try {
			List<Portafolio>portafolios=portafolioService.getAll();
			model.addAttribute("portafolios",portafolios);
			
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
	
	@GetMapping("/{id}")
    public String deletePortafolio(@PathVariable Long id) throws Exception {
        portafolioService.delete(id);
        return "redirect:/portafolios/list";
    }
	
}
