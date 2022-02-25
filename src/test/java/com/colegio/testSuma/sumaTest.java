package com.colegio.testSuma;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class sumaTest {

	@Test
	public void test() {
		int numeroA = 2;
		int numeroB = 4;
		
		Assertions.assertEquals(numeroA+numeroB, 6);
	}

}
