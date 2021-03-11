package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio1Test {
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, 1",
				"10, 4",
				"6, 2",
				"14, 7"})
	
	void testTransformar(int input, int expected) {
		Ejercicio1 c = new Ejercicio1();
		assertEquals(expected, c.transformar(input));
		// assertTrue(c.transformar(input)==expected);
	}
}
