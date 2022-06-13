package com.example.service;

import java.util.List;

import com.example.entities.Empresa;
import com.example.repository.EmpresaRepository;

import org.springframework.stereotype.Service;
@Service
public class EmpresaService {

	private EmpresaRepository empresaRepository;
	
	EmpresaService(EmpresaRepository empresaRepository){
		this.empresaRepository=empresaRepository;
	}
	
	public List<Empresa> getAllEmpresas(){
		return empresaRepository.findAll();
	}
}
