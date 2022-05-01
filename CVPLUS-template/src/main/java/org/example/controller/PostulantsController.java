package org.example.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.example.business.BusinessNegocio;
import org.example.business.PostulantsBusiness;
import org.example.entities.Business;
import org.example.entities.Postulants;
import org.example.repository.PostulantsRepository;

@Named
public class PostulantsController implements Serializable{

	
	private static final long serialVersionUID = 1L;

	{}
/*
		@Inject
		
		private PostulantsBusiness postulantsBusiness;
		
		private Postulants postulants;
		private List<Postulants>postulantss;
		@PostConstruct
		
		public void init()
		{
			postulants = new Postulants();
			postulantss= new ArrayList<>();
			
			getAllPostulants();
			getAllPostulantsName();
		}
		public void getAllPostulants()
		{
			try {
				postulants=postulantsBusiness.getAllPostulants();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void getAllPostulantsName()
		{
			try {
                 postulantss= postulantsBusiness.getAllPostulantsByName(null);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		public Postulants getPostulants()
		{
			return postulants;
		}
		public void setPostulants(Postulants postulants)
		{
			this.postulants=postulants;
		}
		public List<Postulants>getPostulats()
		{
			return postulantss;
		}
	     
		public void setPostulants(List<Postulants>postulantss)
		{
			this.postulantss=postulantss;
		}/*

