package org.example.entities;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Postulant")
public class Postulants implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPostulant;

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

	public Long getIdPostulant() {
		return IdPostulant;
	}

	public void setIdPostulant(Long idPostulant) {
		IdPostulant = idPostulant;
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



}