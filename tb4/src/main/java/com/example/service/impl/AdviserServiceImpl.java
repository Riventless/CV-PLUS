package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Adviser;
import com.example.repository.AdviserRepository;
import com.example.service.AdviserService;

@Service
public class AdviserServiceImpl implements AdviserService {

	@Autowired
	private AdviserRepository adviserRepository;

	@Override
	public List<Adviser> getAll() throws Exception {
		return adviserRepository.findAll();
	}

	@Override
	public Adviser getOneById(Long id) throws Exception {
		return adviserRepository.findById(id).orElseThrow(() -> new RuntimeException("Adviser Not Found!"));
	}

	@Override
	public Long create(Adviser entity) throws Exception {
		adviserRepository.save(entity);
		return entity.getId();
	}

	@Override
	public void update(Long id, Adviser entity) throws Exception {
		Adviser currentAdviser = getOneById(id);
		currentAdviser.setFirstName(entity.getFirstName());
		currentAdviser.setLastName(entity.getLastName());
		currentAdviser.setNumDni(entity.getNumDni());
		currentAdviser.setNumCel(entity.getNumCel());
		currentAdviser.setDirEmail(entity.getDirEmail());
		adviserRepository.save(currentAdviser);

	}

	@Override
	public void delete(Long id) throws Exception {
		adviserRepository.deleteById(id);
	}

	@Override
	public Adviser saveOrUpdate(Adviser entity) throws Exception {
		return null;
	}

	@Override
	public Optional<Adviser> getOne(Long id) throws Exception {
		return null;
	}

}
