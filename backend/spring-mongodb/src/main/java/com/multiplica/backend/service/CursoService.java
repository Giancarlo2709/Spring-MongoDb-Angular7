package com.multiplica.backend.service;

import java.util.List;

import com.multiplica.backend.model.Curso;

public interface CursoService {
	
	List<Curso> findAll();
	
	Curso save(Curso curso);
	
	Curso findOne(String id);
	
	void delete(Curso curso);

}
