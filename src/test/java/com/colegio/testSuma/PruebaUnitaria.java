package com.colegio.testSuma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PruebaUnitaria {
	
	@Test
	public void testSuma() {
		int numeroA = 2;
		int numeroB = 4;
		
		Assertions.assertEquals(numeroA+numeroB, 6);
	}

}
