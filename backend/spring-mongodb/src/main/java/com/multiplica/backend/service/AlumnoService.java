package com.multiplica.backend.service;

import java.util.List;

import com.multiplica.backend.model.Alumno;
import com.multiplica.backend.to.AlumnoCursoTO;

public interface AlumnoService {
	
	List<Alumno> findAll();
	
	Alumno save(Alumno alumno);
	
	List<Alumno> findByCurso(String id);
	
	Alumno insert(Alumno alumno);
	
	Alumno findOne(String id);
	
	void delete(Alumno alumno);
	
	void eliminarCursoAAlumno(AlumnoCursoTO obj);
	
	void agregarCursoAAlumno(AlumnoCursoTO obj);
	
	List<Alumno> findByNotCurso(String id);

}
