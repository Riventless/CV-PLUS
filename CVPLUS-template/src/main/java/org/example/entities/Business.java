package org.example.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Business")
public class Business {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdEmpresa;
	
	@Column(name = "Nombre_Empresa", length = 100, nullable = false)
	private String Nombre_Empresa;
	
	@Column(name = "Direccion_Empresa", length = 50, nullable = false)
	private String Direccion_Empresa;
	
	@Column(name = "NumTelf",nullable = false)
	private Long NumTelf;
	
	@Column(name = "Email_Empresa", length = 50, nullable = false)
	private String Email_Empresa;
	
	@Column(name = "Ruc",nullable = false)
	private Long Ruc;

	
	
	public Long getIdEmpresa() {
		return IdEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		IdEmpresa = idEmpresa;
	}

	public String getNombre_Empresa() {
		return Nombre_Empresa;
	}

	public void setNombre_Empresa(String nombre_Empresa) {
		Nombre_Empresa = nombre_Empresa;
	}

	public String getDireccion_Empresa() {
		return Direccion_Empresa;
	}

	public void setDireccion_Empresa(String direccion_Empresa) {
		Direccion_Empresa = direccion_Empresa;
	}

	public Long getNumTelf() {
		return NumTelf;
	}

	public void setNumTelf(Long numTelf) {
		NumTelf = numTelf;
	}

	public String getEmail_Empresa() {
		return Email_Empresa;
	}

	public void setEmail_Empresa(String email_Empresa) {
		Email_Empresa = email_Empresa;
	}

	public Long getRuc() {
		return Ruc;
	}

	public void setRuc(Long ruc) {
		Ruc = ruc;
	}

	
	

	
}