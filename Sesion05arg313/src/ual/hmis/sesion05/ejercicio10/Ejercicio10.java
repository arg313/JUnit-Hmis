package ual.hmis.sesion05.ejercicio10;

public class Ejercicio10 {

	public int convertirCadenaEntero(String cadena) {

		try {
			int numero = Integer.parseInt(cadena);
			if (numero >32767 || numero < -32768) return -32769;
			return numero;
		} catch (NumberFormatException e) {
			return -32769;
		}
	}
}
