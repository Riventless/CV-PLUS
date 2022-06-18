package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "advisers")
public class Adviser {

	@Id
	@Column(name = "adviser_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Ingresar su nombre")
	@Column(name = "first_name", nullable = false, length = 50)
	private String firstName;

	@NotEmpty(message = "Ingresar su apellido")
	@Column(name = "last_name", nullable = false, length = 50)
	private String lastName;

	@Size(min = 8, max = 8)
	@NotEmpty(message = "Ingresar su dni")
	@Column(name = "num_dni", nullable = false, length = 8)
	private String numDni;

	@NotEmpty(message = "Ingresar su numero de celular")
	@Column(name = "num_cel", nullable = false, length = 9)
	private int numCel;

	@NotEmpty(message = "Ingresar su email")
	@Column(name = "dir_email", nullable = false, length = 50)
	private String dirEmail;

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

	public String getNumDni() {
		return numDni;
	}

	public void setNumDni(String numDni) {
		this.numDni = numDni;
	}

	public int getNumCel() {
		return numCel;
	}

	public void setNumCel(int numCel) {
		this.numCel = numCel;
	}

	public String getDirEmail() {
		return dirEmail;
	}

	public void setDirEmail(String dirEmail) {
		this.dirEmail = dirEmail;
	}

}
