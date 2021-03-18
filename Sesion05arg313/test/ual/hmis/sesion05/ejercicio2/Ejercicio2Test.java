package ual.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio2Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0},{1}) sale {2}")
	@CsvSource({", , false",
		"user, , false",
		"averylongusernametomakethetestfail,pass,false",
		"user,averylongpasswordtomakethetestfail,false",
		"user,pass,true",
		"user,password,false",
		"usuario,pass,false"})
	
	void testLogin(String usuario, String contrasenia, boolean expected) {
		Ejercicio2 c = new Ejercicio2();
		assertEquals(expected, c.login(usuario,contrasenia));
	}
}
