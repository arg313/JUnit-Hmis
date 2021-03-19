package ual.hmis.sesion05.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Ejercicio9Test {

	@Test
	void testListaOrdenada() {
		Ejercicio9 ej9 = new Ejercicio9();
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
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
		
		ArrayList<String> resultado = ej9.listaCadenasOrdenadas(al1, al2);
		
		ArrayList<String> esperado = new ArrayList<String>();
		
		esperado.add(c5);
		esperado.add(c2);
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	void testComparadorCadenas() {
		ComparadorCadenas c = new ComparadorCadenas();
		String c1 = "cadenas";
		String c2 = "iguales";
		String c3 = "corta";
		String c4 = "cadenaLarga";
		
		int comp1 = c.compare(c1, c2); //Cadenas iguales
		assertEquals(c1.compareTo(c2), comp1);
		int comp2 = c.compare(c1, c3); //Cadena mas larga
		assertEquals(1, comp2);
		int comp3 = c.compare(c1, c4); //Cadena mas corta
		assertEquals(-1, comp3);
		
	}

}
