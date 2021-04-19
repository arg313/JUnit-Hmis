package ual.hmis.sesion05.ejercicio9;

import java.util.ArrayList;

public class Ejercicio9 {

	public ArrayList<String> listaCadenasOrdenadas(
			final ArrayList<String> cadena1,
			final ArrayList<String>  cadena2) {
		ArrayList<String> resultado = new ArrayList<String>();

		for (int i = 0; i < cadena1.size(); i++) {
			for (int j = 0; j < cadena2.size(); j++) {
				if (cadena1.get(i).equals(cadena2.get(j))
						&& !resultado.contains(cadena1.get(i))) {
						resultado.add(cadena1.get(i));
				}
			}
		}

		resultado.sort(new ComparadorCadenas());
		return resultado;
	}
}
