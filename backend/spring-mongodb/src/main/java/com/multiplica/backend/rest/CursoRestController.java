package com.multiplica.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.multiplica.backend.model.Curso;
import com.multiplica.backend.service.CursoService;

@RestController
@RequestMapping(value = "/curso")
public class CursoRestController {
	
	@Autowired
	private CursoService cursoService;
	
	@RequestMapping(value = "/obtener", method = RequestMethod.GET)
	public List<Curso> guardar() {
		return cursoService.findAll();
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public Curso guardar(@RequestBody Curso alumno) {
		return cursoService.save(alumno);
	}
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
	public Curso actualizar(@RequestBody Curso alumno) {
		return cursoService.save(alumno);
	}
	
	 @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
	 public Curso obtenerPorId(@PathVariable("id") String id) {
		 return cursoService.findOne(id);
	 }
	 
	 @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
	 public void eliminar(@PathVariable("id") String id) {
		Curso curso = cursoService.findOne(id);
		cursoService.delete(curso);
	 }

}
