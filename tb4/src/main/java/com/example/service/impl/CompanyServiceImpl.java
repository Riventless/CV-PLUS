package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Company;
import com.example.repository.CompanyRepository;
import com.example.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public List<Company> getAll() throws Exception {
		return companyRepository.findAll();
	}

	@Override
	public Company getOneById(Long id) throws Exception {
		return companyRepository.findById(id).orElseThrow(() -> new RuntimeException("Category Not Found!"));
	}

	@Override
	public Long create(Company entity) throws Exception {
		companyRepository.save(entity);
		return entity.getId();
	}

	@Override
	public void update(Long id, Company entity) throws Exception {
		Company currentCategory = getOneById(id);
		currentCategory.setCompanyName(entity.getCompanyName());
		companyRepository.save(currentCategory);
	}

	@Override
	public void delete(Long id) throws Exception {
		companyRepository.deleteById(id);
	}

	@Override
	public Company saveOrUpdate(Company entity) throws Exception {
		return null;
	}

	@Override
	public Optional<Company> getOne(Long id) throws Exception {
		return null;
	}
}
