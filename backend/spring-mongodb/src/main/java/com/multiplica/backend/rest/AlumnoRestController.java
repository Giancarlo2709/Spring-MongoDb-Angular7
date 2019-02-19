package com.multiplica.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.multiplica.backend.model.Alumno;
import com.multiplica.backend.service.AlumnoService;
import com.multiplica.backend.to.AlumnoCursoTO;

@RestController
@RequestMapping(value = "/alumno")
public class AlumnoRestController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@RequestMapping(value = "/obtener", method = RequestMethod.GET)
	public List<Alumno> guardar() {
		return alumnoService.findAll();
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public Alumno guardar(@RequestBody Alumno alumno) {
		return alumnoService.insert(alumno);
	}
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
	public Alumno actualizar(@RequestBody Alumno alumno) {
		return alumnoService.save(alumno);
	}
	
	@RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
	public Alumno obtenerPorId(@PathVariable("id") String id) {
		return alumnoService.findOne(id);
	}
	
	@RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("id") String id) {
		Alumno alumno = alumnoService.findOne(id);
		alumnoService.delete(alumno);
	}
	
	@RequestMapping(value = "/obtenerPorCurso/{id}", method = RequestMethod.GET)
	public List<Alumno> obtenerPorCurso(@PathVariable("id") String id) {
		return alumnoService.findByCurso(id);
	}
	
	@RequestMapping(value = "/eliminarCursoAAlumno", method = RequestMethod.POST)
	public void eliminarCursoAAlumno(@RequestBody AlumnoCursoTO obj) {
		alumnoService.eliminarCursoAAlumno(obj);
	}
	
	@RequestMapping(value = "/agregarCursoAAlumno", method = RequestMethod.POST)
	public void agregarCursoAAlumno(@RequestBody AlumnoCursoTO obj) {
		alumnoService.agregarCursoAAlumno(obj);
	}
	
	@RequestMapping(value = "/obtenerSinCurso/{id}", method = RequestMethod.GET)
	public List<Alumno> obtenerSinCurso(@PathVariable("id") String id) {
		return alumnoService.findByNotCurso(id);
	}

}
