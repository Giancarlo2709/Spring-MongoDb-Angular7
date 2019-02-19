package com.multiplica.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "curso")
public class Curso {

	@Id
	private String cursoId;
	private String codigo;
	private String nombre;
	private String descripcion;
	private String anio;

	public Curso() {
	}

	@PersistenceConstructor
	public Curso(String cursoId, String codigo, String nombre, String descripcion, String anio) {
		super();
		this.cursoId = cursoId;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.anio = anio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getCursoId() {
		return cursoId;
	}

	public void setCursoId(String cursoId) {
		this.cursoId = cursoId;
	}

	@Override
	public String toString() {
		return "Curso [cursoId=" + cursoId + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", anio=" + anio + "]";
	}

}
