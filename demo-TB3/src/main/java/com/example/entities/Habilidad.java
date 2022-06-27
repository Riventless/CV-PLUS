package com.example.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Habilidades")
public class Habilidad {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idHabilidad;
	
	@Column(name = "DescripcionHabi", length = 200, nullable = false)
	private String DescripcionHabi;
	
	@Column(name = "NivelHabi", length = 50, nullable = false)
	private String NivelHabi;
	
	
	@ManyToOne
	@JoinColumn(name="Id_Curriculum",nullable=false)
	private Curriculum curriculum;


	public Long getIdHabilidad() {
		return idHabilidad;
	}


	public void setIdHabilidad(Long idHabilidad) {
		this.idHabilidad = idHabilidad;
	}


	public String getDescripcionHabi() {
		return DescripcionHabi;
	}


	public void setDescripcionHabi(String descripcionHabi) {
		DescripcionHabi = descripcionHabi;
	}


	public String getNivelHabi() {
		return NivelHabi;
	}


	public void setNivelHabi(String nivelHabi) {
		NivelHabi = nivelHabi;
	}


	public Curriculum getCurriculum() {
		return curriculum;
	}


	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}





	
	
}