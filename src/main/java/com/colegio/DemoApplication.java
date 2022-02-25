package com.colegio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pruebas.Conexion;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
		Conexion c= Conexion.getInstancia();
		c.conectar();
		c.desconectar();
	
	}

}
