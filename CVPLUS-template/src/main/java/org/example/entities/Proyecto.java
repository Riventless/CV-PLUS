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
@Table(name="Proyecto")
public class Proyecto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdProyecto;
	
	@Column(name = "Titulo_Proyect", length = 100, nullable = false)
	private String Titulo_Proyect;
	
	@Column(name = "Descripcion_Proyect", length = 500, nullable = false)
	private String Descripcion_Proyect;
	
	@Column(name = "Colaboradores", length = 200, nullable = false)
	private String Colaboradores;
	
	@ManyToOne
	@JoinColumn(name="IdPortafolio",nullable=false)
	private Portafolio portafolio;

	public Long getIdProyecto() {
		return IdProyecto;
	}

	public void setIdProyecto(Long idProyecto) {
		IdProyecto = idProyecto;
	}

	public String getTitulo_Proyect() {
		return Titulo_Proyect;
	}

	public void setTitulo_Proyect(String titulo_Proyect) {
		Titulo_Proyect = titulo_Proyect;
	}

	public String getDescripcion_Proyect() {
		return Descripcion_Proyect;
	}

	public void setDescripcion_Proyect(String descripcion_Proyect) {
		Descripcion_Proyect = descripcion_Proyect;
	}

	public String getColaboradores() {
		return Colaboradores;
	}

	public void setColaboradores(String colaboradores) {
		Colaboradores = colaboradores;
	}

	public Portafolio getPortafolio() {
		return portafolio;
	}

	public void setPortafolio(Portafolio portafolio) {
		this.portafolio = portafolio;
	}

	
	
}