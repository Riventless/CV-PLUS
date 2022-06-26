package com.example.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
@Table(name="Empresas")
public class Empresa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdEmpresa;

	@NotEmpty(message = "Debe ingresar nombre del doctor*")

	@Column(name = "Nombre_Empresa", length = 55, nullable = false)
	private String Nombre_Empresa;
	
	@Column(name = "Direccion_Empresa", length = 50, nullable = false)
	private String Direccion_Empresa; 
	
	@Size(min = 9, max = 9, message = "El numero de telefono tiene 8 digitos")
	@Column(name = "NumTelf",nullable = false)
	private String NumTelf;
	
	@Column(name = "Email_Empresa", length = 50, nullable = false)
	private String Email_Empresa;
	
	@Size(min = 8, max = 50, message = "El numero de RUC debe tener 20 digitos")
	@Column(name = "Ruc",nullable = false)
	private String Ruc;
	
	@Size(min = 8, max = 20, message = "La contraseña debe tener minimo digitos")
	@Column(name = "Contrasenia",length = 50, nullable = false)
	private String Contrasenia;
	
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

	public String getNumTelf() {
		return NumTelf;
	}

	public void setNumTelf(String numTelf) {
		NumTelf = numTelf;
	}

	public String getEmail_Empresa() {
		return Email_Empresa;
	}

	public void setEmail_Empresa(String email_Empresa) {
		Email_Empresa = email_Empresa;
	}

	public String getRuc() {
		return Ruc;
	}

	public void setRuc(String ruc) {
		Ruc = ruc;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	
	

	
}