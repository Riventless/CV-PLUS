package com.example.entities;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "FirstName", length = 80, nullable = false)
	private String firstName;

	@Column(name = "LastName", length = 80, nullable = false)
	private String lastName;

	@Column(name = "Email", length = 80, nullable = false)
	private String email;

	@Column(name = "Dni", nullable = false)
	private Long dni;

	@Column(name = "Rubro", length = 80, nullable = false)
	private String rubro;

	@Column(name = "Categoria", nullable = true)
	private Boolean categoria;

	@Column(name = "Numero", nullable = false)
	private Long numero;

	@Column(name = "Contrasenia", length = 50, nullable = false)
	private String contrasenia;

	
	@OneToMany(mappedBy="students", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Portafolio> portafolios;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getDni() {
		return dni;
	}


	public void setDni(Long dni) {
		this.dni = dni;
	}


	public String getRubro() {
		return rubro;
	}


	public void setRubro(String rubro) {
		this.rubro = rubro;
	}


	public Boolean getCategoria() {
		return categoria;
	}


	public void setCategoria(Boolean categoria) {
		this.categoria = categoria;
	}


	public Long getNumero() {
		return numero;
	}


	public void setNumero(Long numero) {
		this.numero = numero;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public List<Portafolio> getPortafolios() {
		return portafolios;
	}


	public void setPortafolios(List<Portafolio> portafolios) {
		this.portafolios = portafolios;
	}

	

	/*public Set<Advisory> getAdvisories() {
		return advisories;
	}

	public void setAdvisories(Set<Advisory> advisories) {
		this.advisories = advisories;
	}*/

	
	
}