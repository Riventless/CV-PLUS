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
@Table(name="Job")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdJob;
	
	@Column(name = "Descripcion_Job", length = 200, nullable = false)
	private String Descripcion_Job;
	
	@Column(name = "Requerimientos", length = 100, nullable = false)
	private String Requerimientos;
	
	@Column(name = "Vacantes", nullable = false)
	private Long Vacantes;
	
	


	@ManyToOne
	@JoinColumn(name="IdEmpresa",nullable=false)
	private Business business;




	public Long getIdJob() {
		return IdJob;
	}




	public void setIdJob(Long idJob) {
		IdJob = idJob;
	}




	public String getDescripcion_Job() {
		return Descripcion_Job;
	}




	public void setDescripcion_Job(String descripcion_Job) {
		Descripcion_Job = descripcion_Job;
	}




	public String getRequerimientos() {
		return Requerimientos;
	}




	public void setRequerimientos(String requerimientos) {
		Requerimientos = requerimientos;
	}




	public Long getVacantes() {
		return Vacantes;
	}




	public void setVacantes(Long vacantes) {
		Vacantes = vacantes;
	}




	public Business getBusiness() {
		return business;
	}




	public void setBusiness(Business business) {
		this.business = business;
	}


	
	
	
	
}