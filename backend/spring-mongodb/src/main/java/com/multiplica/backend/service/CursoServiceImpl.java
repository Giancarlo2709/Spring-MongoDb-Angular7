package com.multiplica.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplica.backend.model.Curso;
import com.multiplica.backend.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	@Override
	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}

	@Override
	public Curso findOne(String id) {
		return cursoRepository.findByCursoId(id);
	}

	@Override
	public void delete(Curso curso) {
		cursoRepository.delete(curso);
	}

}
