package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Adviser;
import com.example.entity.Company;
import com.example.service.AdviserService;
import com.example.service.CompanyService;

@Controller
@RequestMapping("/asesores")
public class AdviserController {

	@Autowired
	private AdviserService adviserService;

	@Autowired
	private CompanyService companyService;

	@GetMapping
	public String showAllAdvisers(Model model) {
		try {
			model.addAttribute("advisers", adviserService.getAll());
			model.addAttribute("companies", companyService.getAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "asesores/list";
	}

	@GetMapping("/new")
	public String newAdviserForm(Model model) {
		model.addAttribute("adviser", new Adviser());
		List<Company> companies;
		try {
			companies = companyService.getAll();
			model.addAttribute("companies", companies);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "asesores/new";
	}

	@PostMapping("/save")
	public String saveNewAdviser(Adviser adviser) {
		try {
			long id = adviserService.create(adviser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/asesores";
	}

	@GetMapping("/edit/{id}")
	public String editAdviserForm(@PathVariable("id") long id, Model model) {
		Adviser adviser;
		try {
			adviser = adviserService.getOneById(id);
			List<Company> companies = companyService.getAll();
			model.addAttribute("companies", companies);
			model.addAttribute("adviser", adviser);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "asesores/edit";
	}

	@PostMapping("/update/{id}")
	public String updateAdviser(@PathVariable("id") long id, Adviser adviser) {
		try {
			adviserService.update(id, adviser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/asesores";
	}
}
