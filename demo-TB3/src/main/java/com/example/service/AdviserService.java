package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Adviser;
import com.example.repository.AdviserRepository;

@Service
public class AdviserService {
	
	@Autowired
	private AdviserRepository adviserRepository;
	
	public List<Adviser> getAllAdvisers() {
		return (List<Adviser>) adviserRepository.findAll();
	}
}
