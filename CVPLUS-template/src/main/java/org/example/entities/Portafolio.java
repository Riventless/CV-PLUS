package org.example.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Portafolio")
public class Portafolio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdPortafolio;
	
	@Column(name = "Sector", length = 50, nullable = false)
	private String Sector;
	
	
	@ManyToOne
	@JoinColumn(name="IdPostulant",nullable=false)
	private Postulants postulants;


	public Long getIdPortafolio() {
		return IdPortafolio;
	}


	public void setIdPortafolio(Long idPortafolio) {
		IdPortafolio = idPortafolio;
	}


	public String getSector() {
		return Sector;
	}


	public void setSector(String sector) {
		Sector = sector;
	}


	public Postulants getPostulants() {
		return postulants;
	}


	public void setPostulants(Postulants postulants) {
		this.postulants = postulants;
	}


	
	
}