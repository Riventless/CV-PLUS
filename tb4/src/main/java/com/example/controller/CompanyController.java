package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.example.entity.Company;
import com.example.service.CompanyService;

@Controller
@RequestMapping("/empresas")
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@GetMapping
	public String showAllCompanies(Model model) {
		try {
			model.addAttribute("companies", companyService.getAll());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "empresas/list";
	}

	@GetMapping("/new")
	public String newComForm(Model model) {
		model.addAttribute("company", new Company());
		return "empresas/new";
	}

	@PostMapping("/save")
	public String saveNewCompany(Company company) {
		try {
			long id = companyService.create(company);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/empresas";
	}

	@GetMapping("/edit/{id}")
	public String editCompanyForm(@PathVariable("id") long id, Model model) {
		Company company;
		try {
			company = companyService.getOneById(id);
			model.addAttribute("company", company);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "empresas/edit";
	}

	@PostMapping("/update/{id}")
	public String updateCompany(@PathVariable("id") long id, Company company) {
		try {
			companyService.update(id, company);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/empresas";
	}
}
