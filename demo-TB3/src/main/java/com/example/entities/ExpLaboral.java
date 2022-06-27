package com.example.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ExpLaborals")
public class ExpLaboral {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdExpLab;
	
	@Column(name = "DescripcionExpL", length = 200, nullable = false)
	private String DescripcionExpL;
	
	@Column(name = "FechaInicioExpL",nullable = false)
	private LocalDate FechaInicioExpL;
	
	@Column(name = "FechaFinExpL",nullable = false)
	private LocalDate FechaFinExpL;
	
	@ManyToOne
	@JoinColumn(name="Id_Curriculum",nullable=false)
	private Curriculum curriculum;

	public Long getIdExpLab() {
		return IdExpLab;
	}

	public void setIdExpLab(Long idExpLab) {
		IdExpLab = idExpLab;
	}

	public String getDescripcionExpL() {
		return DescripcionExpL;
	}

	public void setDescripcionExpL(String descripcionExpL) {
		DescripcionExpL = descripcionExpL;
	}

	public LocalDate getFechaInicioExpL() {
		return FechaInicioExpL;
	}

	public void setFechaInicioExpL(LocalDate fechaInicioExpL) {
		FechaInicioExpL = fechaInicioExpL;
	}

	public LocalDate getFechaFinExpL() {
		return FechaFinExpL;
	}

	public void setFechaFinExpL(LocalDate fechaFinExpL) {
		FechaFinExpL = fechaFinExpL;
	}

	public Curriculum getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	
	
	

	
	
	
	
}
