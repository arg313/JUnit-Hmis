package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public String encriptar(final int encript) {
		if (encript < 5) {
			return "*****";
		} else if (encript > 12) {
			return "************";
		}
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < encript; i++) {
			buffer.append("*");
		}
		String resultado = buffer.toString();
		return resultado;
	}
}
