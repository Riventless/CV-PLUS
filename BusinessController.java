package org.example.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.example.business.BusinessNegocio;
import org.example.entities.Business;
import org.example.repository.BusinessRepository;




@Named
public class BusinessController implements Serializable {



	private static final long serialVersionUID = 1L;
	@Inject
	private BusinessNegocio businessNegocio;
	
	private Business business;
	private List<Business> businesss;
	
	
	@PostConstruct
	public void init()
	{
		business=new Business();
		businesss=new ArrayList<>();
		
		getAllBusinesss();
		getAllNameBusinesss();
	}
	public void getAllBusinesss()
		{
			try {
				businesss= businessNegocio.getAll();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	public void getAllNameBusinesss()
	{
		try {
			businesss= businessNegocio.getBussinesByName(null);
		} catch (Exception e) {
			// TODO: handle exceptions
		}
	}
	
	
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public List<Business> getBusinesss() {
		return businesss;
	}
	public void setBusinesss(List<Business> businesss) {
		this.businesss = businesss;
	}
  

	
   
	
	
	
}
