package com.multiplica.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.multiplica.backend.model.Alumno;

@Repository
public interface AlumnoRepository extends MongoRepository<Alumno, Integer> {
	
	Alumno findByAlumnoId(String id);

}
