package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "portafolios")
public class Portafolio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPortafolio;
	
	@Column(name = "Nombre_Porta", length = 50, nullable = false)
	private String NombrePortafolio;
	
	@ManyToOne
	@JoinColumn(name="IdStudent",nullable=false)
	private Student student;
	
	
	
	@ManyToMany(mappedBy="portafolios")
	private List<Proyecto>proyectos=new ArrayList<>();
	

	
	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public Long getIdPortafolio() {
		return IdPortafolio;
	}

	public void setIdPortafolio(Long idPortafolio) {
		IdPortafolio = idPortafolio;
	}

	public String getNombrePortafolio() {
		return NombrePortafolio;
	}

	public void setNombrePortafolio(String nombrePortafolio) {
		NombrePortafolio = nombrePortafolio;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}




}
