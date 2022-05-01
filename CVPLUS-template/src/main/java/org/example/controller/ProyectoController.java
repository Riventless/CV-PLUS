package org.example.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.example.business.PortafolioBusiness;
import org.example.business.ProyectoBusiness;
import org.example.entities.Portafolio;
import org.example.entities.Proyecto;

@Named
@SessionScoped
public class ProyectoController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProyectoBusiness proyectoBusiness;
	@Inject
	private PortafolioBusiness portafolioBusiness;
	
	private Proyecto proyecto;
	private List<Proyecto>proyectos;
	
	private Portafolio portafolio;
	private List<Portafolio>portafolios;
	
	public Portafolio getPortafolio() {
		return portafolio;
	}

	public void setPortafolio(Portafolio portafolio) {
		this.portafolio = portafolio;
	}

	public List<Portafolio> getPortafolios() {
		return portafolios;
	}

	public void setPortafolios(List<Portafolio> portafolios) {
		this.portafolios = portafolios;
	}

	@PostConstruct
	public void init() {
		proyecto=new Proyecto();
		proyectos=new ArrayList<>();
		portafolio=new Portafolio();
		portafolios=new ArrayList<>();
		
		getAllProyectos();
	}
	
	public void getAllProyectos() {
		try {
			proyectos=proyectoBusiness.getAll();
			
		} catch (Exception e) {
			
		}
	}
	
	public String newProyecto() {
		try {
			this.portafolios=portafolioBusiness.getAllPortafolios();
			this.resetForm();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "insertPro.xhtml";
	}
	
	public String saveProyecto() {
		
		String view="";
		try {
			if (proyecto.getIdProyecto()!=null) {// si se cumple sera un update
				proyecto.setPortafolio(portafolio);
				proyectoBusiness.update(proyecto);
			}else {//sino guardar
				proyecto.setPortafolio(portafolio);
				proyectoBusiness.insert(proyecto);
			}
			this.getAllProyectos();
			this.resetForm();
			view="listPro";
		} catch (Exception e) {
			// TODO: handle exception
		}

		return view;
	}
	
	public void resetForm() {
		proyecto=new Proyecto();
	}
	
	public String listProyecto() {
		return "listPro.xhtml";
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
