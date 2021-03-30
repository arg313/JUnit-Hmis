package ual.hmis.sesion05.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio10Test {

	@ParameterizedTest(name = "{index} => La cadena {0} es el entero {1}")
    @MethodSource("cadenaProvider")
	void test(String cadena, int expected) {
		Ejercicio10 ej10 = new Ejercicio10();
		
		int res1 = ej10.convertirCadenaEntero(cadena);
		assertEquals(expected, res1);
	}

	static Stream<Arguments> cadenaProvider() {
        return Stream.of(
                Arguments.of("10",10),
                Arguments.of("-10",-10),
                Arguments.of("B3",-32769),
                Arguments.of("400000",-32769),
                Arguments.of("-400000",-32769));
    }
}
