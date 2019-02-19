package com.multiplica.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.multiplica.backend.model.Curso;

@Repository
public interface CursoRepository extends MongoRepository<Curso, Integer> {
	
	Curso findByCursoId(String id);

}
