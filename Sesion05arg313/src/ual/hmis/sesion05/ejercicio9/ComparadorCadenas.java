package ual.hmis.sesion05.ejercicio9;

import java.io.Serializable;
import java.util.Comparator;

public class ComparadorCadenas implements Comparator<String>, Serializable {
	public int compare(final String cadena1, final String cadena2) {
		if (cadena1.length() > cadena2.length()) {
			return 1;
		} else if (cadena1.length() < cadena2.length()) {
			return -1;
		} else {
			return cadena1.compareTo(cadena2);
		}
	}
}
