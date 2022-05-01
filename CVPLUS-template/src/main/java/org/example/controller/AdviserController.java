package org.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.example.business.AdviserBusiness;
import org.example.entities.Adviser;

public class AdviserController {

	private static final long serialVersionUID = 1L;
	@Inject
	private AdviserBusiness adviserBusiness;
	private Adviser adviser;
	private List<Adviser> advisers;
	
	
	@PostConstruct
	public void init()
	{
		adviser=new Adviser();
		advisers=new ArrayList<>();
		
		getAllAdvisers();
		getAllNameAdvisers();
	}
	public void getAllAdvisers()
		{
			try {
				advisers= adviserBusiness.getAll();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	public void getAllNameAdvisers()
	{
		try {
			advisers= adviserBusiness.getAdviserByName(null);
		} catch (Exception e) {
			// TODO: handle exceptions
		}
	}
	
	
	public Adviser getBusiness() {
		return adviser;
	}
	public void setBusiness(Adviser adviser) {
		this.adviser =adviser;
	}
	public List<Adviser> getBusinesss() {
		return advisers;
	}
	public void setBusinesss(List<Adviser> advisers) {
		this.advisers = advisers;
	}
}
