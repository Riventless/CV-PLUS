package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Adviser")
public class Adviser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdAdviser;
	
	@Column(name = "First_NameAs",length = 50,nullable = false)
	private String First_NameAs;
	
	@Column(name = "Last_NameAs",length = 50,nullable = false)
	private String Last_NameAs;
	

	@Column(name = "Email_As", length = 50, nullable = false)
	private String Email_As;

	@Column(name = "Dni_As", nullable = false)
	private Long Dni_As;
	
	@Column(name = "Num_Cel_As", nullable = false)
	private Long Num_Cel_As;
	
	@Column(name = "Contrasenia",length = 50, nullable = false)
	private String Contrasenia;
	

	public Long getIdAdviser() {
		return IdAdviser;
	}

	public void setIdAdviser(Long idAdviser) {
		IdAdviser = idAdviser;
	}

	public String getFirst_NameAs() {
		return First_NameAs;
	}

	public void setFirst_NameAs(String first_NameAs) {
		First_NameAs = first_NameAs;
	}

	public String getLast_NameAs() {
		return Last_NameAs;
	}

	public void setLast_NameAs(String last_NameAs) {
		Last_NameAs = last_NameAs;
	}

	public String getEmail_As() {
		return Email_As;
	}

	public void setEmail_As(String email_As) {
		Email_As = email_As;
	}

	public Long getDni_As() {
		return Dni_As;
	}

	public void setDni_As(Long dni_As) {
		Dni_As = dni_As;
	}

	public Long getNum_Cel_As() {
		return Num_Cel_As;
	}

	public void setNum_Cel_As(Long num_Cel_As) {
		Num_Cel_As = num_Cel_As;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}


	
	

}
