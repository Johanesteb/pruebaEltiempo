package com.pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseConExcepciones{
	
	private final static Logger LOGGER = Logger.getLogger("com.pruebas.ClaseConExcepciones");
	
    public void metodoInformatico() throws Exception{
        try{
        	 LOGGER.log(Level.INFO, "Se completo el proceso");
        }catch (Exception e){
        	 LOGGER.log(Level.SEVERE, "Ha fallado algo en el proceso");
            e.printStackTrace();
        }
    }
	

}

