package ual.hmis.sesion05.ejercicio9;

import java.util.Comparator;

public class ComparadorCadenas implements Comparator<String> {
	public int compare(String c1, String c2) {
		if (c1.length() > c2.length()) return 1;
		else if (c1.length() < c2.length()) return -1;
		else return c1.compareTo(c2);
	}
}
