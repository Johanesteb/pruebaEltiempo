package com.colegio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.model.Alumno;

public interface AlumnoDAO extends JpaRepository<Alumno, Integer> {
	
	

}
