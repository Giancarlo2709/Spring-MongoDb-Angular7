package com.multiplica.backend.to;

import com.multiplica.backend.model.Alumno;
import com.multiplica.backend.model.Curso;

public class AlumnoCursoTO {
	
	private Alumno alumno;
	private Curso curso;
	
	public AlumnoCursoTO() {
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}	

}
