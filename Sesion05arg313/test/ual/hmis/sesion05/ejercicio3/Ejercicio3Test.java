package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio3Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {2}")
	@CsvSource({"4,*****",
		"13,************",
		"6,******"})
	
	void testEncriptar(int n, String expected) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(expected, c.encriptar(n));
	}
}
