package com.multiplica.backend.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "alumno")
public class Alumno {
	
	@Id
	private String alumnoId;
	
	private String nombres;
	private String apellidos;
	private String telefono;
	private String fechaNacimiento;
	private String email;
	private String direccion;
	
	@DBRef
	private List<Curso> cursos;
	
	public Alumno() {
	}
	
	@PersistenceConstructor
	public Alumno(String alumnoId,String nombres,String apellidos,String telefono,String fechaNacimiento,String email,String direccion) {
		super();
		this.alumnoId = alumnoId;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.direccion = direccion;
	}
	
	public String getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(String alumnoId) {
		this.alumnoId = alumnoId;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Alumno [alumnoId=" + alumnoId + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono="
				+ telefono + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", direccion=" + direccion
				+ "]";
	}	
}
