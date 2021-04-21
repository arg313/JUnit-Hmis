package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {

	public boolean login(final String username, final String password) {
		// comprobar que sean distintos de vacio
		if (username == null || password == null) {
			return false;
		}
		// comprobar que la longitud sea < 30
		if (username.length() >= 30 || password.length() >= 30) {
			return false;
		}
		// llamar al metodo de la bbdd
		return compruebaLoginEnBD(username, password);
	}

	public boolean compruebaLoginEnBD(final String username,
			final String password) {
		// m�todo mock (simulado)
		if (!username.equals("user") || !password.equals("pass")) {
			return false;
		}
		return true;
	}
}
