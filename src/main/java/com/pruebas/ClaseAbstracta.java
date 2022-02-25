package com.pruebas;

public abstract class ClaseAbstracta {
	
    protected String nombres;
    protected String apellidos;

    public abstract void cursoAsignado();
    
    public void colegio(){
        System.out.println("Colegio Uno");
    }

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
    
    

}
