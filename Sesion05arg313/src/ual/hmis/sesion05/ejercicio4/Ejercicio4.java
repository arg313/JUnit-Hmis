package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {

	public String interseccion(String p1, String p2) {
		String resultado = "", caracter;
		for (int i = 0;i<p1.length();i++) {
			for (int j = 0;j<p2.length();j++) {
				caracter = String.valueOf(p2.substring(j, j+1));
				if ( (p1.charAt(i) == p2.charAt(j)) && !resultado.contains(caracter)) {
					resultado += p1.charAt(i);
					continue;
				}
			}
		}
		return resultado;
	}
}
