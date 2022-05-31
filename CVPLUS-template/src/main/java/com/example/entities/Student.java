package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdStudent;

	@Column(name = "FirstName", length = 80, nullable = false)
	private String FirstName;

	@Column(name = "LastName", length = 80, nullable = false)
	private String LastName;
	
	@Column(name = "Email", length = 80, nullable = false)
	private String Email;

	@Column(name = "Dni", nullable = false)
	private Long Dni;

	@Column(name = "Rubro", length = 80, nullable = false)
	private String Rubro;
	
	@Column(name = "Categoria", nullable = true)
	private Boolean Categoria;

	@Column(name = "Numero", nullable = false)
	private Long Numero;
	
	@Column(name = "Contrasenia",length = 50, nullable = false)
	private String Contrasenia;

	public Long getIdStudent() {
		return IdStudent;
	}

	public void setIdStudent(Long idStudent) {
		IdStudent = idStudent;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getDni() {
		return Dni;
	}

	public void setDni(Long dni) {
		Dni = dni;
	}

	public String getRubro() {
		return Rubro;
	}

	public void setRubro(String rubro) {
		Rubro = rubro;
	}

	public Boolean getCategoria() {
		return Categoria;
	}

	public void setCategoria(Boolean categoria) {
		Categoria = categoria;
	}

	public Long getNumero() {
		return Numero;
	}

	public void setNumero(Long numero) {
		Numero = numero;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}
	
	
	
	

}
