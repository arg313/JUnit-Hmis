package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio4Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {2}")
	@CsvSource({"holah,hierro,ho"})
	
	void testInterseccion(String p1, String p2, String expected) {
		Ejercicio4 c = new Ejercicio4();
		assertEquals(expected, c.interseccion(p1,p2));
	}
}
