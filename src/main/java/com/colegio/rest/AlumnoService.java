package com.colegio.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.dao.AlumnoDAO;
import com.colegio.model.Alumno;

@RestController
@RequestMapping("alumno")
public class AlumnoService{
	
	@Autowired
	private AlumnoDAO alumnoDAO;
	
	//Metodo GET
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar(@RequestBody Alumno alumno) {
				
		try {
			alumnoDAO.save(alumno);
			return new ResponseEntity<>("Alumno creado", HttpStatus.CREATED);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>("Ha fallado algo en el proceso", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/consultar")
	public List<Alumno> consultar(){
		return alumnoDAO.findAll();		
	}
	
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> eliminar(@PathVariable ("id") Integer id) {
		
		try {
			alumnoDAO.deleteById(id);
			return new ResponseEntity<>("Alumno eliminado", HttpStatus.CREATED);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>("Ha fallado algo en el proceso o el alumno no existe", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<?> actualizar(@RequestBody Alumno alumno) {
		
		try {
			alumnoDAO.save(alumno);
			return new ResponseEntity<>("Alumno actualizado", HttpStatus.CREATED);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>("Ha fallado algo en el proceso", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
