package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public String encriptar(int n) {
		if (n<5) return "*****";
		else if (n>12) return "************";
		String resultado = "";
		for (int i = 0;i<n;i++) resultado += "*";
		return resultado;
	}
}
