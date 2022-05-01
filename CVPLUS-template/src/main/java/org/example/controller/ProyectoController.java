package org.example.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.example.business.PortafolioBusiness;
import org.example.business.ProyectoBusiness;
import org.example.entities.Proyecto;

@Named
public class ProyectoController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProyectoBusiness proyectoBusiness;
	@Inject
	private PortafolioBusiness portafolioBusiness;
	
	private Proyecto proyecto;
	private List<Proyecto>proyectos;
	
	@PostConstruct
	public void init() {
		proyecto=new Proyecto();
		proyectos=new ArrayList<>();
		
		getAllProyectos();
	}
	
	public void getAllProyectos() {
		try {
			proyectos=proyectoBusiness.getAll();
			
		} catch (Exception e) {
			
		}
	}
	
	
	
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public List<Proyecto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

}
