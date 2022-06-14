package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="portafolios" )
public class Portafolio {
	@Id
<<<<<<< Updated upstream
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="comentario",nullable=true)
	private String comentario;
	@Column(name="valoracion",nullable=true)
	private String valoracion;
=======
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPortafolio;
	
	@NotEmpty(message = "Ingresar el titulo del portafolio")
	@Column(name = "Nombre_Porta", length = 50, nullable = false)
	private String NombrePortafolio;
	
	@NotEmpty(message = "Ingresar la descripcion del portafolio")
	@Column(name = "Descripcion_Portafolio", length =500, nullable = false)
	private String DescripcionPortafolio;
	
	@ManyToOne
	@JoinColumn(name="IdStudent",nullable=true)
	private Student student;
	
	
	public Portafolio() {
	}
	
	public Portafolio(String NombrePortafolio) {
		this.NombrePortafolio = NombrePortafolio;
		
	}
	
	
>>>>>>> Stashed changes
	
	@ManyToMany(mappedBy="portafolios")
	private List<Empresa> empresas=new ArrayList<>();
	
	
<<<<<<< Updated upstream
	public Long getId() {
		return id;
=======
	public String getDescripcionPortafolio() {
		return DescripcionPortafolio;
	}

	public void setDescripcionPortafolio(String descripcionPortafolio) {
		DescripcionPortafolio = descripcionPortafolio;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
>>>>>>> Stashed changes
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getValoracion() {
		return valoracion;
	}
	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
}
