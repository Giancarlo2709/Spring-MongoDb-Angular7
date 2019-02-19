package com.multiplica.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.multiplica.backend.model.Alumno;
import com.multiplica.backend.model.Curso;
import com.multiplica.backend.repository.AlumnoRepository;
import com.multiplica.backend.to.AlumnoCursoTO;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Resource
	private MongoTemplate mongoTemplate;
	
	@Autowired 
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> findAll() {
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno save(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	
	public List<Alumno> findByCurso(String id) {
		Query query = new Query(); 
		query.addCriteria(Criteria.where("cursos.cursoId").is(id));
		return mongoTemplate.find(query, Alumno.class);
	}

	@Override
	public Alumno insert(Alumno alumno) {
		return alumnoRepository.insert(alumno);
	}

	@Override
	public Alumno findOne(String id) {
		return alumnoRepository.findByAlumnoId(id);
	}

	@Override
	public void delete(Alumno alumno) {
		alumnoRepository.delete(alumno);
	}
	
	@Override
	public void eliminarCursoAAlumno(AlumnoCursoTO obj) {
		Alumno alumno = alumnoRepository.findByAlumnoId(obj.getAlumno().getAlumnoId());
		alumno.getCursos().removeIf(l-> l.getCursoId().equals(obj.getCurso().getCursoId()));
		alumnoRepository.save(alumno);
	}
	
	@Override
	public void agregarCursoAAlumno(AlumnoCursoTO obj) {
		Alumno alumno = alumnoRepository.findByAlumnoId(obj.getAlumno().getAlumnoId());
		if(alumno.getCursos()!= null) {
			alumno.getCursos().add(obj.getCurso());
		} else {
			List<Curso> cursos = new ArrayList<>();
			cursos.add(obj.getCurso());
			alumno.setCursos(cursos);
		}		
		alumnoRepository.save(alumno);
	}
	
	public List<Alumno> findByNotCurso(String id) {
		
		List<Alumno> alumnosAll = alumnoRepository.findAll();
		List<Alumno> alumnosCurso = findByCurso(id);
		
		alumnosAll.removeAll(alumnosCurso);
		
		return alumnosAll;
	}

}
