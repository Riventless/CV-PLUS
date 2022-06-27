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
@Table(name = "ExpAcademica")
public class ExpAcademica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdExpAc;

	@Column(name = "DescripcionExpA", length = 200, nullable = false)
	private String DescripcionExpA;

	@Column(name = "FechaInicioExpA", nullable = false)
	private LocalDate FechaInicioExpA;

	@Column(name = "FechaFinExpA", nullable = false)
	private LocalDate FechaFinExpA;

	@ManyToOne
	@JoinColumn(name = "Id_Curriculum", nullable = false)
	private Curriculum curriculum;

	public Long getIdExpAc() {
		return IdExpAc;
	}

	public void setIdExpAc(Long idExpAc) {
		IdExpAc = idExpAc;
	}

	public String getDescripcionExpA() {
		return DescripcionExpA;
	}

	public void setDescripcionExpA(String descripcionExpA) {
		DescripcionExpA = descripcionExpA;
	}

	public LocalDate getFechaInicioExpA() {
		return FechaInicioExpA;
	}

	public void setFechaInicioExpA(LocalDate fechaInicioExpA) {
		FechaInicioExpA = fechaInicioExpA;
	}

	public LocalDate getFechaFinExpA() {
		return FechaFinExpA;
	}

	public void setFechaFinExpA(LocalDate fechaFinExpA) {
		FechaFinExpA = fechaFinExpA;
	}

	public Curriculum getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	

}
