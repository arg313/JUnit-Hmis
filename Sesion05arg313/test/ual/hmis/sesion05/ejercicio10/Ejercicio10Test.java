package ual.hmis.sesion05.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio10Test {

	@Test
	void test() {
		Ejercicio10 ej10 = new Ejercicio10();
		
		int res1 = ej10.convertirCadenaEntero("10");
		assertEquals(10, res1);
		int res2 = ej10.convertirCadenaEntero("-10");
		assertEquals(-10, res2);
		int res3 = ej10.convertirCadenaEntero("B3");
		assertEquals(-32769, res3);
		int res4 = ej10.convertirCadenaEntero("400000");
		assertEquals(-32769, res4);
		int res5 = ej10.convertirCadenaEntero("-400000");
		assertEquals(-32769, res5);
	}

}
