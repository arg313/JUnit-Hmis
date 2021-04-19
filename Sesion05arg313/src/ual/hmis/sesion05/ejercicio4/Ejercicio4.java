package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {

	public String interseccion(final String cadena1, final String cadena2) {
		StringBuffer buffer = new StringBuffer();
		String resultadoParcial;
		String caracter;
		for (int i = 0; i < cadena1.length(); i++) {
			for (int j = 0; j < cadena2.length(); j++) {
				caracter = String.valueOf(cadena2.substring(j, j + 1));
				resultadoParcial = buffer.toString();
				if ((cadena1.charAt(i) == cadena2.charAt(j))
				&&
				!resultadoParcial.contains(caracter)) {
					buffer.append(cadena1.charAt(i));
					continue;
				}
			}
		}
		String resultado = buffer.toString();
		return resultado;
	}
}
