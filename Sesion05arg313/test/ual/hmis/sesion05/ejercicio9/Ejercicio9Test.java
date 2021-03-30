package ual.hmis.sesion05.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio9Test {

	@ParameterizedTest(name = "{index} => Salida: {2}")
    @MethodSource("vehiculoProvider")
	void testListaOrdenada(ArrayList<String> al1, ArrayList<String> al2, ArrayList<String> expected) {
		Ejercicio9 ej9 = new Ejercicio9();
		
		ArrayList<String> resultado = ej9.listaCadenasOrdenadas(al1, al2);
		
		assertEquals(expected, resultado);
		
	}
	
	static Stream<Arguments> vehiculoProvider() {
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList<String> expected = new ArrayList<String>();
		String c1 = "";
		String c2 = "asignatura";
		String c3 = "hola";
		String c4 = "hmis";
		String c5 = "cadena";
		
		al1.add(c2);
		al1.add(c1);
		al1.add(c5);
		
		al2.add(c4);
		al2.add(c2);
		al2.add(c3);
		al2.add(c5);
		al2.add(c2);
		
		expected.add(c5);
		expected.add(c2);
        return Stream.of(
                Arguments.of(al1,al2,expected));
    }
	
	@ParameterizedTest(name = "{index} => Resultado comparacion: {2}")
    @MethodSource("stringProvider")
	void testComparadorCadenas(String c1, String c2, int expected) {
		ComparadorCadenas c = new ComparadorCadenas();
		int comp3 = c.compare(c1, c2);
		assertEquals(expected, comp3);
		
	}
	
	static Stream<Arguments> stringProvider() {
		String c1 = "cadenas";
		String c2 = "iguales";
		String c3 = "corta";
		String c4 = "cadenaLarga";
        return Stream.of(
                Arguments.of(c1,c2,c1.compareTo(c2)),
                Arguments.of(c1,c3,1),
                Arguments.of(c1,c4,-1));
    }

}
