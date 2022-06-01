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
@Table(name = "advisories")
public class Advisory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAsesoria;

	@Column(name = "Comentario", length = 300)
	private String comentario;

	@Column(name = "Estado", length = 20, nullable = false)
	private String estado;

	@ManyToOne
	@JoinColumn(name = "idStudent", nullable = false)
	private Student student;

	@ManyToOne
	@JoinColumn(name = "idServicioAdviser", nullable = false)
	private ServicioXAdviser servicioAdviser;
	
	
	
	public Long getIdAsesoria() {
		return idAsesoria;
	}

	public void setIdAsesoria(Long idAsesoria) {
		this.idAsesoria = idAsesoria;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ServicioXAdviser getServicioAdviser() {
		return servicioAdviser;
	}

	public void setServicioAdviser(ServicioXAdviser servicioAdviser) {
		this.servicioAdviser = servicioAdviser;
	}

}