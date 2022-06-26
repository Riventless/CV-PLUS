package com.example.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity 
@Table(name="Students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdStudent;

	@NotEmpty(message= "Ingresar nombre del estudiante")
	@Column(name = "FirstName", length = 20, nullable = false)
	private String FirstName;

	@NotEmpty(message= "Ingresar apellido del estudiante")
	@Column(name = "LastName", length = 20, nullable = false)
	private String LastName;
	
	@Email(message = "Ingresa un email con el formato correcto.")
	@NotEmpty(message = "Ingresa el correo")
	@Column(name = "Email", length = 30, nullable = false)
	private String Email;

	@Size(min = 8, max = 8, message = "El DNI tiene que ser de 8 digitos")
	@NotEmpty(message = "Ingresar DNI")
	@Column(name = "Dni", nullable = false)
	private String Dni;

	@NotEmpty(message = "Ingresar Rubro")
	@Column(name = "Rubro", length = 20, nullable = false)
	private String Rubro;
	

	@Column(name = "Categoria", nullable = true)
	private Boolean Categoria;
	
	
	@Column(name = "Numero",  nullable = false, length = 10)
	private String Numero;
	
	public void setNumero(String numero) {
		Numero = numero;
	}

	@NotEmpty(message = "Ingresar contraseña")
	@Column(name = "Contrasenia",length = 30, nullable = false)
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

	public String getNumero() {
		return Numero;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
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


	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}
}
